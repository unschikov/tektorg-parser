package org.acme.getting.started;


import io.quarkus.redis.client.RedisClient;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.acme.getting.started.dto.ExportProcedurePort;
import org.acme.getting.started.dto.ExportRequestType;
import org.acme.getting.started.dto.Procedure;
import org.acme.getting.started.dto.Procedures;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.xml.ws.Holder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
@Getter
@Setter
@Slf4j
public class TektorgParser {

    @ConfigProperty(name = "url-request")
    String urlRequest;
    @ConfigProperty(name = "limit-page")
    Integer limitPage;
    @ConfigProperty(name = "sections")
    String[] sections;

    @Inject
    SoapClient soapClient;

    /**
     * обход происходит постранично, на каждой странице по определенному количеству процедур (@limitPage)
      * как только мы обошли все станицы, и список пустой, мы переходим на первую страницу и меняем секцию
     * */
    public List<Procedure> getProceduresFromAllSections(LocalDateTime lastDate) {
        int indexSection = 0;
        int page = 1;
        List<Procedure> procedureList = new ArrayList<>();
        ExportRequestType request = new ExportRequestType();
        if (lastDate != null) {
            request.setStartDate(lastDate.truncatedTo(ChronoUnit.SECONDS).toString());
        }
        request.setLimitPage(limitPage);
        while (indexSection < sections.length) {
            request.setSectionCode(sections[indexSection]);
            request.setPage(page);
            List<Procedure> procedures = getProceduresLimitOnePage(request);
            procedureList.addAll(procedures);
            page++;
            if (procedures.isEmpty()) {
                page = 1;
                indexSection++;
            }
        }
        return procedureList;
    }

    /***
     * получаем количество процедур в рамках одной странци @limitPage(количество процедур на одной станицу)
     * если мы получили 4000 процедур, и limitPage=500 то страниц будет 8
     */
    public List<Procedure> getProceduresLimitOnePage(ExportRequestType request) {
        Holder<Integer> totalProcedures = createIntegerSoapHolder();
        Holder<Integer> currentPage = createIntegerSoapHolder();
        Holder<Integer> totalPage = createIntegerSoapHolder();
        Holder<Integer> limitProceduresInPage = createIntegerSoapHolder();
        Holder<String> sectionName = createStringSoapHolder();
        Holder<String> sectionCode = createStringSoapHolder();
        Holder<Procedures> procedures = createProceduresSoapHolder();

        ExportProcedurePort exportProcedurePort = createExportProcedurePort(urlRequest);
        exportProcedurePort.procedures(
                request,
                totalProcedures,
                currentPage,
                totalPage,
                limitProceduresInPage,
                sectionName,
                sectionCode,
                procedures
        );
        return procedures.value.getProcedure();
    }

    ExportProcedurePort createExportProcedurePort(String urlRequest) {
        return soapClient.createExportProcedurePort(urlRequest);
    }
    Holder<Procedures> createProceduresSoapHolder() {
        return new Holder<>(new Procedures());
    }
    Holder<String> createStringSoapHolder() {
        return new Holder<>();
    }
    Holder<Integer> createIntegerSoapHolder() {
        return new Holder<>();
    }
}