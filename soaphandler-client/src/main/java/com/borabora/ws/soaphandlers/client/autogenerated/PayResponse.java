
package com.borabora.ws.soaphandlers.client.autogenerated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balance" type="{http://service.server.soaphandlers.ws.borabora.com/}balance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payResponse", propOrder = {
    "balance"
})
public class PayResponse {

    protected Balance balance;

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Balance }
     *     
     */
    public Balance getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance }
     *     
     */
    public void setBalance(Balance value) {
        this.balance = value;
    }

}
