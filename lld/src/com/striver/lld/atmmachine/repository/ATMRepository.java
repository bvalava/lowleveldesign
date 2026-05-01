package com.striver.lld.atmmachine.repository;

import com.striver.lld.atmmachine.domain.ATM;
import com.striver.lld.atmmachine.domain.state.ATMState;

import java.util.List;
import java.util.Optional;

public interface ATMRepository {

    ATM save(ATM atm);

    Optional<ATM> findById(String atmId);

    List<ATM> findAll();

    void updateATMState(String atmId, ATMState state);
}
