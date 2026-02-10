package com.striver.lld.factory;

// This service don't want to create a objects and call the methods of logistics, That is why we are creating factory
public class LogisticsService {

    public void send(String mode) {

        Logistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();
    }
}
