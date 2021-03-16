package org.acme.getting.started.dto;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://api.tektorg.ru/procedures/soap", name = "exportProcedurePort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ExportProcedurePort {

    @WebMethod(action = "urn:procedures")
    void procedures(

        @WebParam(partName = "symbol", name = "symbol")
        ExportRequestType symbol,

        @WebParam(partName = "totalProcedures", mode = WebParam.Mode.OUT, name = "totalProcedures")
        javax.xml.ws.Holder<Integer> totalProcedures,

        @WebParam(partName = "currentPage", mode = WebParam.Mode.OUT, name = "currentPage")
        javax.xml.ws.Holder<Integer> currentPage,

        @WebParam(partName = "totalPage", mode = WebParam.Mode.OUT, name = "totalPage")
        javax.xml.ws.Holder<Integer> totalPage,

        @WebParam(partName = "limitProceduresInPage", mode = WebParam.Mode.OUT, name = "limitProceduresInPage")
        javax.xml.ws.Holder<Integer> limitProceduresInPage,

        @WebParam(partName = "sectionName", mode = WebParam.Mode.OUT, name = "sectionName")
        javax.xml.ws.Holder<String> sectionName,

        @WebParam(partName = "sectionCode", mode = WebParam.Mode.OUT, name = "sectionCode")
        javax.xml.ws.Holder<String> sectionCode,

        @WebParam(partName = "procedures", mode = WebParam.Mode.OUT, name = "procedures")
        javax.xml.ws.Holder<Procedures> procedures

    );
}
