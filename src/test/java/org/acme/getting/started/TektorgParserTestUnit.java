package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.acme.getting.started.dto.ExportProcedurePort;
import org.acme.getting.started.dto.ExportRequestType;
import org.acme.getting.started.dto.Procedure;
import org.acme.getting.started.dto.Procedures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.inject.Inject;
import javax.xml.ws.Holder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@QuarkusTest
class TektorgParserTestUnit {

    @InjectMock
    TektorgParser parser;

    @BeforeEach
    void setUp() {
        parser.setUrlRequest("http://localhost:8080/api/tektorg");
    }

    @Test
    void getProceduresFromAllSections() {
        List<Procedure> mockListProcedure = new ArrayList<>();
        mockListProcedure.add(new Procedure());
        mockListProcedure.add(new Procedure());
        ExportRequestType mockExportRequestType = mock(ExportRequestType.class);

        when(parser.getProceduresLimitOnePage(mockExportRequestType)).thenReturn(mockListProcedure);
        System.out.println(parser.getProceduresLimitOnePage(mockExportRequestType));

        System.out.println("--------------");
        System.out.println(parser.getProceduresFromAllSections(null));
    }

//    @Test
//    void getProcedures_callRequestProceduresListFromSOAP() {
//        // setup
//        ExportRequestType mockExportRequestType = mock(ExportRequestType.class);
//        doReturn(mockExportRequestType).when(parser).createExportRequestType(0, 1);
//        List<Procedure> mockListProcedure = new ArrayList<>();
//        doReturn(mockListProcedure).when(parser).requestProceduresListFromSOAP(mockExportRequestType);
//        ExportProcedurePort mockExportProcedurePort = mock(ExportProcedurePort.class);
//        doReturn(mockExportProcedurePort).when(parser).createExportProcedurePort(anyString());
//        // act
//        parser.getProcedures();
//        // verify
//        verify(parser).requestProceduresListFromSOAP(mockExportRequestType);
//    }
//
//    @Test
//    void createExportRequestType_shouldReturnExportRequestType() {
//        // setup
//        ExportRequestType requestType = new ExportRequestType();
//        requestType.setPage(1);
//        // act
//        ExportRequestType actualRequestType = parser.createExportRequestType(0, 1);
//        // verify
//        Assertions.assertEquals(requestType.getPage(), actualRequestType.getPage());
//    }
//
//    @Test
//    void createExportRequestType_callSetLimitPage() {
//        // setup
//        ExportRequestType requestType = new ExportRequestType();
//        requestType.setLimitPage(parser.getLimitPage());
//        // act
//        ExportRequestType actualExportRequestType = parser.createExportRequestType(0, 1);
//        // verify
//        Assertions.assertEquals(requestType.getLimitPage(), actualExportRequestType.getLimitPage());
//    }
//
//    @Test
//    void createExportRequestType_callSetSectionCode() {
//        // setup
//        ExportRequestType requestType = new ExportRequestType();
//        requestType.setSectionCode(parser.getSections()[0]);
//        // act
//        ExportRequestType actualRequestType = parser.createExportRequestType(0, 1);
//        // verify
//        Assertions.assertEquals(requestType.getSectionCode(), actualRequestType.getSectionCode());
//    }
//
//    @Test
//    void requestProceduresListFromSOAP_callCreateIntegerSoapHolder() {
//        //setup
//        ExportProcedurePort mockExportProcedurePort = mock(ExportProcedurePort.class);
//        doReturn(mockExportProcedurePort).when(parser).createExportProcedurePort(anyString());
//        // act
//        parser.requestProceduresListFromSOAP(mock(ExportRequestType.class));
//        // verify
//        verify(parser, Mockito.times(4)).createIntegerSoapHolder();
//
//    }
//
//    @Test
//    void requestProceduresListFromSOAP_callCreateStringSoapHolder() {
//        // setup
//        ExportProcedurePort mockExportProcedurePort = mock(ExportProcedurePort.class);
//        doReturn(mockExportProcedurePort).when(parser).createExportProcedurePort(anyString());
//        // act
//        parser.requestProceduresListFromSOAP(mock(ExportRequestType.class));
//        // verify
//        verify(parser, Mockito.times(2)).createStringSoapHolder();
//    }
//
//    @Test
//    void requestProceduresListFromSOAP_callCreateProceduresSoapHolder() {
//        // setup
//        ExportProcedurePort mockExportProcedurePort = mock(ExportProcedurePort.class);
//        doReturn(mockExportProcedurePort).when(parser).createExportProcedurePort(anyString());
//        // act
//        parser.requestProceduresListFromSOAP(mock(ExportRequestType.class));
//        // verify
//        verify(parser).createProceduresSoapHolder();
//    }
//
//    @Test
//    void requestProceduresListFromSOAP_callCreateExportProcedurePort() {
//        // setup
//        ExportProcedurePort mockExportProcedurePort = mock(ExportProcedurePort.class);
//        doReturn(mockExportProcedurePort).when(parser).createExportProcedurePort(anyString());
//        // act
//        parser.requestProceduresListFromSOAP(mock(ExportRequestType.class));
//        // verify
//        verify(parser).createExportProcedurePort(anyString());
//    }
//
//    @Test
//    void createIntegerSoapHolder_shouldReturnIntegerHolder() {
//        // setup
//        Holder<Integer> expectedIntegerHolder = new Holder<>();
//        System.out.println(expectedIntegerHolder.value);
//        // act
//        Holder<Integer> actualyIntegerHolder = parser.createIntegerSoapHolder();
//        // verify
//        Assertions.assertEquals(expectedIntegerHolder.getClass().getSimpleName(), actualyIntegerHolder.getClass().getSimpleName());
//    }
//
//    @Test
//    public void requestProceduresListFromSOAP_checkResult() {
//        //  setup
//        ExportProcedurePort mockExportProcedurePort = mock(ExportProcedurePort.class);
//        doReturn(mockExportProcedurePort).when(parser).createExportProcedurePort(any());
//        ExportRequestType mockExportRequestType = mock(ExportRequestType.class);
//
//        //Integer
//        Holder mockHolder = mock(Holder.class);
//        doReturn(mockHolder).when(parser).createIntegerSoapHolder();
//
//        //String
//        doReturn(mockHolder).when(parser).createIntegerSoapHolder();
//
//        //Procedures
//        Holder<Procedures> proceduresHolder = new Holder<>();
//        Procedures mockProcedures = mock(Procedures.class);
//        List<Procedure> mockProceduresList = mock(List.class);
//        when(mockProcedures.getProcedure()).thenReturn(mockProceduresList);
//        proceduresHolder.value = mockProcedures;
//        doReturn(proceduresHolder).when(parser).createProceduresSoapHolder();
//
//        doNothing().when(mockExportProcedurePort).procedures(any(), any(), any(), any(),
//                any(), any(), any(), any());
//
//        //  act
//        List<Procedure> result = parser.requestProceduresListFromSOAP(mockExportRequestType);
//
//        //  verify
//        Assertions.assertEquals(result, mockProceduresList);
//    }

}