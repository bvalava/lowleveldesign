package com.striver.lld.atmmachine.domain.state;

import com.striver.lld.atmmachine.domain.ATM;
import com.striver.lld.atmmachine.domain.Denomination;

import java.util.Map;

public interface SupportsNotes {

    void processTransaction(ATM atm, long amount, Map<Denomination, Integer> notes);
}
