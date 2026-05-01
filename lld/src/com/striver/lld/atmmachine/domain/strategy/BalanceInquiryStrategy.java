package com.striver.lld.atmmachine.domain.strategy;

import com.striver.lld.atmmachine.domain.Denomination;
import com.striver.lld.atmmachine.domain.Transaction;
import com.striver.lld.atmmachine.domain.TransactionStatus;
import com.striver.lld.atmmachine.domain.TransactionType;

import java.util.Map;

public class BalanceInquiryStrategy implements TransactionStrategy{

    @Override
    public Transaction processTransaction(String sessionId, long amount, Map<Denomination, Integer> notes) {
        // TODO: Get account balance from bank server
        System.out.println("[BalanceInquiryStrategy] Processing balance inquiry for session: " + sessionId);

        Transaction transaction = new Transaction(
                "TXN_" + System.currentTimeMillis(),
                "ATM_001", // TODO: Get from session
                sessionId,
                "ACC_001", // TODO: Get from session
                TransactionType.BALANCE,
                0);

        // TODO: Set actual balance from account
        transaction.setStatus(TransactionStatus.SUCCESS);
        System.out.println("[BalanceInquiryStrategy] Balance inquiry completed");

        return transaction;
    }
}
