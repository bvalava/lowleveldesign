package com.striver.lld.factory;

public class Air implements Logistics {
    @Override
    public void send() {
        System.out.println("sent by Air");
    }
}
