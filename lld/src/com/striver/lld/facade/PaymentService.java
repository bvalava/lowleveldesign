package com.striver.lld.facade;

public class PaymentService {

    public void makePayment(String accountId, double amount) {
        System.out.println("Payment of ₹" + amount + " successful for account " + accountId);
    }
}
