package com.borabora.ws.soaphandlers.client;

import com.borabora.ws.soaphandlers.client.handler.StatiticsHandler;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrbueno on 04/08/15.
 */
public class CustomHandlerResolver implements HandlerResolver {
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        ArrayList<Handler> handlers = new ArrayList<>();
        handlers.add(new StatiticsHandler());
        return handlers;
    }
}
