package com.striver.lld.vendingmachine.domain.state;

import com.striver.lld.vendingmachine.domain.PaymentRequest;
import com.striver.lld.vendingmachine.domain.Transaction;
import com.striver.lld.vendingmachine.domain.VendingMachine;

public interface VendingMachineState {

    Transaction processPayment(VendingMachine machine, PaymentRequest request);
    void cancelPayment(VendingMachine machine, int transactionId);
    String getStateName();
}
