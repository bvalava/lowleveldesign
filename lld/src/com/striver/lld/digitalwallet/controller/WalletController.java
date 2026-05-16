package com.striver.lld.digitalwallet.controller;

import com.striver.lld.digitalwallet.domain.AccountStatement;
import com.striver.lld.digitalwallet.domain.Wallet;
import com.striver.lld.digitalwallet.service.TransactionService;
import com.striver.lld.digitalwallet.service.WalletService;

public class WalletController {

    private WalletService walletService;
    private TransactionService transactionService;

    public WalletController(WalletService walletService, TransactionService transactionService) {
        this.walletService = walletService;
        this.transactionService = transactionService;
    }

    public Wallet createWallet(String userId) {
        return walletService.createWallet(userId);
    }

    public long getBalance(String accountNumber) {
        return walletService.getByAccountNumber(accountNumber).getBalanceMinor();
    }

    public AccountStatement getStatement(String accountNumber, Long startUtc, Long endUtc) {
        return transactionService.getStatement(accountNumber, startUtc, endUtc);
    }
}
