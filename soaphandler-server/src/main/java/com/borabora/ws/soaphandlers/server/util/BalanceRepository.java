package com.borabora.ws.soaphandlers.server.util;

import com.borabora.ws.soaphandlers.server.model.Balance;

/**
 * Created by mrbueno on 02/08/15.
 */
public class BalanceRepository {

    public static Balance getBalance(Long id) {
        return new Balance(id, 100.0);
    }
}
