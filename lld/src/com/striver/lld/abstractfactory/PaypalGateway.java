package com.striver.lld.abstractfactory;

public class PaypalGateway implements PaymentGateway{

    public void processPayment(double amount) {
        System.out.println("Processing USD payment via PayPal: " + amount);
    }
}
