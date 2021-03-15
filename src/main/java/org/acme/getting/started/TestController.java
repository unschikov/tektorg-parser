package org.acme.getting.started;

import org.acme.getting.started.dto.Procedure;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/test")
public class TestController {

    @Inject
    TektorgParser tektorgParser;

    @GET
    @Path("/tektorg")
    @Produces(MediaType.APPLICATION_XML)
    public String  testTektorg() {
        List<Procedure> procedureList = tektorgParser.getProcedures();

        for (Procedure procedure : procedureList) {
            System.out.println(procedure.getRemoteId());
        }
        return "test tektorg";
    }
}
