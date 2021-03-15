package org.acme.getting.started;

import lombok.Data;
import org.acme.getting.started.dto.ExportProcedurePort;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;

@ApplicationScoped
@Data
public class SoapClient {

    JaxWsProxyFactoryBean proxyFactory;

    public ExportProcedurePort createExportProcedurePort(String urlRequest) {
        if (proxyFactory == null) {
            proxyFactory = new JaxWsProxyFactoryBean();
            proxyFactory.setAddress(urlRequest);
            proxyFactory.setInInterceptors(Collections.singletonList(new ResponseHeaderInInterceptor()));
        }
        return proxyFactory.create(ExportProcedurePort.class);
    }
}

class ResponseHeaderInInterceptor extends AbstractPhaseInterceptor<Message> {
    public ResponseHeaderInInterceptor() {
        super(Phase.RECEIVE);
    }
    @Override
    public void handleMessage(Message message) {
        message.put(Message.CONTENT_TYPE, "text/xml;charset=UTF-8");
    }
}
