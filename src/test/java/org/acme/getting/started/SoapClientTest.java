package org.acme.getting.started;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.acme.getting.started.dto.ExportProcedurePort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.mockito.Mockito.*;

@QuarkusTest
class SoapClientTest {

    @Inject
    SoapClient soapClient;

    @BeforeEach
    void setUp() {
        soapClient = spy(soapClient);
    }

    @Test
    void createExportProcedurePort_shouldReturnNotNull() {
        ExportProcedurePort exportProcedurePort = soapClient.createExportProcedurePort(any());
        Assertions.assertNotNull(exportProcedurePort);
    }
}