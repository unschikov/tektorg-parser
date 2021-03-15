package org.acme.getting.started;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.acme.getting.started.dto.ExportProcedurePort;
import org.acme.getting.started.dto.ExportRequestType;
import org.acme.getting.started.dto.Procedure;
import org.acme.getting.started.dto.Procedures;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.Calendar;
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

    public List<Procedure> getProcedures() {
        int indexSection = 0;
        int numberPage = 1;
        List<Procedure> procedureList = new ArrayList<>();
        while (indexSection < sections.length) {
            ExportRequestType requestType = createExportRequestType(indexSection, numberPage);
            List<Procedure> procedures = requestProceduresListFromSOAP(requestType);
            procedureList.addAll(procedures);
            numberPage++;
            if (procedures.isEmpty()) {
                numberPage = 1;
                indexSection++;
            }
        }
        return procedureList;
    }

    ExportRequestType createExportRequestType(int indexSection, int page) {
        ExportRequestType requestType = new ExportRequestType();

//        //TODO реализовать дату забора данных
        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.DAY_OF_WEEK, -2);
        requestType.setStartDate(startDate);

        requestType.setLimitPage(limitPage);
        requestType.setSectionCode(sections[indexSection]);
        requestType.setPage(page);
        return requestType;
    }

    protected List<Procedure> requestProceduresListFromSOAP(ExportRequestType requestType) {
        Holder<Integer> totalProcedures = createIntegerSoapHolder();
        Holder<Integer> currentPage = createIntegerSoapHolder();
        Holder<Integer> totalPage = createIntegerSoapHolder();
        Holder<Integer> limitProceduresInPage = createIntegerSoapHolder();
        Holder<String> sectionName = createStringSoapHolder();
        Holder<String> sectionCode = createStringSoapHolder();
        Holder<Procedures> procedures = createProceduresSoapHolder();

        ExportProcedurePort exportProcedurePort = createExportProcedurePort(urlRequest);
        exportProcedurePort.procedures(
                requestType,
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