package org.acme.getting.started.controller;

import org.acme.getting.started.TektorgParser;
import org.acme.getting.started.dto.ExportRequestType;
import org.acme.getting.started.dto.Procedure;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Path("/test")
public class TestController {

    @Inject
    TektorgParser tektorgParser;

    @GET
    @Path("/hello")
    public String  hello() {
        return "hello";
    }

    @GET
    @Path("/tektorg")
    @Produces(MediaType.APPLICATION_XML)
    public String  testTektorg() {

        List<Procedure> procedureList = tektorgParser.getProceduresFromAllSections(LocalDateTime.now().minusDays(2));
        System.out.println("count procedures --- " + procedureList.size());
        for (Procedure procedure : procedureList) {
            System.out.println(procedure.getRemoteId());
        }
        return "test tektorg";
    }
}
