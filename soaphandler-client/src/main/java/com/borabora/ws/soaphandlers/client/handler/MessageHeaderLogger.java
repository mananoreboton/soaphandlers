package com.borabora.ws.soaphandlers.client.handler;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by mrbueno on 02/08/15.
 */
public class MessageHeaderLogger implements SOAPHandler<SOAPMessageContext> {
    public MessageHeaderLogger() {
        System.out.println("com.borabora.ws.soaphandlers.server.handler.MessageHeaderLogger");
    }

    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (!outbound) {
            System.out.println("context = " + context);
            SOAPHeader soapHeader = null;
            try {
                soapHeader = context.getMessage().getSOAPHeader();
            } catch (SOAPException e) {
                e.printStackTrace();
            }
            Iterator iterator = soapHeader.examineAllHeaderElements();
            while (iterator.hasNext()) {
                SOAPHeaderElement soapHeaderElement = (SOAPHeaderElement) iterator.next();
                System.out.println("- soapHeaderElement.getActor() = " + soapHeaderElement.getActor());
            }
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
