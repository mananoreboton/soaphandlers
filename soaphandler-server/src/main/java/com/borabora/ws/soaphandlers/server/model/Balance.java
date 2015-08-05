package com.borabora.ws.soaphandlers.server.model;

/**
 * Created by mrbueno on 02/08/15.
 */
public class Balance {
    private Long customer;
    private Double money;

    public Balance() {
    }

    public Balance(Long customer, Double money) {
        this.customer = customer;
        this.money = money;
    }

    public Long getCustomer() {
        return customer;
    }

    public Double getMoney() {
        return money;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
