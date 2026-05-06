package com.striver.lld.hotel.controller;

import com.striver.lld.hotel.domain.Transaction;
import com.striver.lld.hotel.domain.TransactionStatus;
import com.striver.lld.hotel.service.TransactionService;

public class TransactionController {

    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public Transaction initiateTransaction(String bookingId) {
        return transactionService.initiateTransaction(bookingId);
    }

    public void handleTransactionCallback(String providerRef, TransactionStatus status) {
        transactionService.handleCallback(providerRef, status);
    }
}
