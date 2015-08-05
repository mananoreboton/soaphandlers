package com.borabora.ws.soaphandlers.server.model;

/**
 * Created by mrbueno on 02/08/15.
 */
public class Transaction {

    private Long id;
    private Double money;

    public Transaction() {
    }

    public Transaction(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Double getMoney() {
        return money;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
