
package com.borabora.ws.soaphandlers.client.autogenerated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PaymentsServiceService", targetNamespace = "http://service.server.soaphandlers.ws.borabora.com/", wsdlLocation = "http://localhost:2205/?wsdl")
public class PaymentsServiceService
    extends Service
{

    private final static URL PAYMENTSSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException PAYMENTSSERVICESERVICE_EXCEPTION;
    private final static QName PAYMENTSSERVICESERVICE_QNAME = new QName("http://service.server.soaphandlers.ws.borabora.com/", "PaymentsServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:2205/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PAYMENTSSERVICESERVICE_WSDL_LOCATION = url;
        PAYMENTSSERVICESERVICE_EXCEPTION = e;
    }

    public PaymentsServiceService() {
        super(__getWsdlLocation(), PAYMENTSSERVICESERVICE_QNAME);
    }

    public PaymentsServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PAYMENTSSERVICESERVICE_QNAME, features);
    }

    public PaymentsServiceService(URL wsdlLocation) {
        super(wsdlLocation, PAYMENTSSERVICESERVICE_QNAME);
    }

    public PaymentsServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PAYMENTSSERVICESERVICE_QNAME, features);
    }

    public PaymentsServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaymentsServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PaymentsService
     */
    @WebEndpoint(name = "PaymentsServicePort")
    public PaymentsService getPaymentsServicePort() {
        return super.getPort(new QName("http://service.server.soaphandlers.ws.borabora.com/", "PaymentsServicePort"), PaymentsService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PaymentsService
     */
    @WebEndpoint(name = "PaymentsServicePort")
    public PaymentsService getPaymentsServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.server.soaphandlers.ws.borabora.com/", "PaymentsServicePort"), PaymentsService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PAYMENTSSERVICESERVICE_EXCEPTION!= null) {
            throw PAYMENTSSERVICESERVICE_EXCEPTION;
        }
        return PAYMENTSSERVICESERVICE_WSDL_LOCATION;
    }

}
