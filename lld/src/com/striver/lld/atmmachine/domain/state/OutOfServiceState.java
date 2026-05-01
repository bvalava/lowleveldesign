package com.striver.lld.atmmachine.domain.state;

import com.striver.lld.atmmachine.domain.ATM;
import com.striver.lld.atmmachine.domain.exception.InvalidATMOperationException;

public class OutOfServiceState extends AbstractATMState{

    @Override
    public void insertCard(ATM atm, String cardId) {
        throw new InvalidATMOperationException("ATM is out of service");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("[OutOfServiceState] ejectCard (if any)");
    }
}
