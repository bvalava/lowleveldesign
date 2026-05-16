package com.striver.lld.digitalwallet.repository;

import com.striver.lld.digitalwallet.domain.Wallet;

import java.util.Optional;

public interface WalletRepository {

    Wallet save(Wallet wallet);
    Optional<Wallet> findById(String walletId);
    Optional<Wallet> findByAccountNumber(String accountNumber);
}
