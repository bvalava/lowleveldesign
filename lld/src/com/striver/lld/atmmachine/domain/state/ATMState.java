package com.striver.lld.atmmachine.domain.state;

import com.striver.lld.atmmachine.domain.ATM;
import com.striver.lld.atmmachine.domain.TransactionType;
import com.striver.lld.atmmachine.domain.exception.InvalidATMOperationException;

public interface ATMState {

    void insertCard(ATM atm, String cardId) throws InvalidATMOperationException;

    void ejectCard(ATM atm) throws InvalidATMOperationException;

    void enterPin(ATM atm, String pin) throws InvalidATMOperationException;

    void selectTransaction(ATM atm, TransactionType type) throws InvalidATMOperationException;

    void processTransaction(ATM atm, long amount) throws InvalidATMOperationException;

    void endSession(ATM atm) throws InvalidATMOperationException;

    ATMState next(ATM atm);
}
