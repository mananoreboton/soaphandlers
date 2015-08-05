package com.borabora.ws.soaphandlers.server;

import com.borabora.ws.soaphandlers.server.service.PaymentsService;

import javax.xml.ws.Endpoint;

/**
 * Created by mrbueno on 02/08/15.
 */
public class Main {
    public static void main(String[] args) {
        // Show raw http requests/responses
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");

        String address = args[0];
        Endpoint.publish(address, new PaymentsService());
        System.out.println("Server started at " + address);
    }
}
