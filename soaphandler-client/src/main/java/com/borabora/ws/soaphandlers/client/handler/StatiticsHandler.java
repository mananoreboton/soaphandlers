package com.borabora.ws.soaphandlers.client.handler;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by mrbueno on 04/08/15.
 */
public class StatiticsHandler implements SOAPHandler<SOAPMessageContext> {

    private AtomicLong msgs = new AtomicLong(0);

    public StatiticsHandler() {
        System.out.println("com.borabora.ws.soaphandlers.client.handler.StatiticsHandler");
    }

    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (!outbound) {
            System.out.println("msgs = " + msgs.incrementAndGet());
        }
        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    public void close(MessageContext context) {

    }

    public Set<QName> getHeaders() {
        return Collections.EMPTY_SET;
    }
}
