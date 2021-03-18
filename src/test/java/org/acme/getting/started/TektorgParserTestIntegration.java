package org.acme.getting.started;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.acme.getting.started.dto.ExportRequestType;
import org.acme.getting.started.dto.Procedure;
import org.acme.getting.started.util.WebServerTektorg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;

@QuarkusTest
@QuarkusTestResource(WebServerTektorg.class)
class TektorgParserTestIntegration {

    @Inject
    TektorgParser parser;

    @BeforeEach
    void setUp() {
        parser.setUrlRequest("http://localhost:8080/api/tektorg");
    }

    @Test
    void procedureUnmarshaling() {
        List<Procedure> procedureList = parser.getProceduresLimitOnePage(new ExportRequestType());
        Integer[] arrRemoteId = new Integer[]{4531, 4530, 4529};
        int i = 0;
        for (Procedure procedure : procedureList) {
            Assertions.assertEquals(arrRemoteId[i], procedure.getRemoteId());
            System.out.println(procedure);
            i++;
        }
        System.out.println(i);
    }
}
