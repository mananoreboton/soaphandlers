package com.borabora.ws.soaphandlers.server.service;

import com.borabora.ws.soaphandlers.server.model.Balance;
import com.borabora.ws.soaphandlers.server.model.Transaction;
import com.borabora.ws.soaphandlers.server.util.BalanceRepository;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by mrbueno on 02/08/15.
 */

@WebService
@HandlerChain(file="handler-chain.xml")
public class PaymentsService {

    @WebResult(name = "balance")
    @WebMethod(operationName = "pay")
    public Balance pay(Transaction t) {
        Long id = t.getId();
        System.out.println("[ID:" + id + "]");
        Balance balance = BalanceRepository.getBalance(id);
        balance.setMoney(balance.getMoney() + t.getMoney());
        // Update balance
        return balance;
    }
}
