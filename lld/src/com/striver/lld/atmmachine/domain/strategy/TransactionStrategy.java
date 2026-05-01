package com.striver.lld.atmmachine.domain.strategy;

import com.striver.lld.atmmachine.domain.Denomination;
import com.striver.lld.atmmachine.domain.Transaction;

import java.util.Map;

public interface TransactionStrategy {

    Transaction processTransaction(String sessionId, long amount, Map<Denomination, Integer> notes);
}
