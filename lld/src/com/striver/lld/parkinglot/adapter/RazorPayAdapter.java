package com.striver.lld.parkinglot.adapter;

import java.util.Random;
import java.util.UUID;

public class RazorPayAdapter implements PaymentGatewayAdapter{


    @Override
    public boolean pay(UUID ticketId, double amount) {

        System.out.println("[ADAPTER] RazorPayAdapter processing payment for ticket: " + ticketId + " amount: " + amount);

        Random random = new Random();
        boolean success = random.nextDouble() < 0.9;

        System.out.println("[ADAPTER] RazorPayAdapter payment result: " + (success ? "SUCCESS" : "FAILED"));
        return success;
    }
}
