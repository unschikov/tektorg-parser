package org.acme.getting.started.util;

import com.github.jknack.handlebars.internal.Files;
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import com.github.tomakehurst.wiremock.WireMockServer;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.Collections;
import java.util.Map;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class WebServerTektorg implements QuarkusTestResourceLifecycleManager {

    private WireMockServer wireMockServer;
    private final String pathToFileForGettingSingleProcedure = "src/test/resources/tektorg-procedures.xml";

    public static void main(String[] args) {
        WebServerTektorg testWebServerTektorg = new WebServerTektorg();
        testWebServerTektorg.start();
    }

    @SneakyThrows
    @Override
    public Map<String, String> start() {
        wireMockServer = new WireMockServer();
        wireMockServer.start();
        System.out.println("---------------------- start WireMockWebServerTektorg ------------------------");
        stubFor(
                post
                        (urlEqualTo("/api/tektorg"))
                        .willReturn(aResponse()
                                .withHeader("Content-Type", "text/xml; charset=UTF-8")
                                .withBody(Files.read(new FileReader(pathToFileForGettingSingleProcedure)))
                        ));
        return Collections.singletonMap("url-request", wireMockServer.baseUrl());
    }

    @Override
    public void stop() {
        if (null != wireMockServer) {
            wireMockServer.stop();
        }
    }
}
