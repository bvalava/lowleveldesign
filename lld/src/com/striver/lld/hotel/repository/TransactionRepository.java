package com.striver.lld.hotel.repository;

import com.striver.lld.hotel.domain.Transaction;

import java.util.Optional;

public interface TransactionRepository {

    Transaction save(Transaction transaction);

    Optional<Transaction> findByProviderRef(String providerRef);
}
