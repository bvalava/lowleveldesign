package com.striver.lld.adapter;

public interface PaymentGateway {

    void pay(String orderId, double amount);
}
