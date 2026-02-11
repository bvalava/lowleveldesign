package com.striver.lld.strategy;

public class AirportQueueStrategy implements MatchingStrategy{

    @Override
    public void match(String riderLocation) {
        System.out.println("Matching using FIFO airport queue for " + riderLocation);
        // Match first-in-line driver for airport pickup
    }
}
