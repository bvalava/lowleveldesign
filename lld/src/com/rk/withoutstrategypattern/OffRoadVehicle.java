package com.rk.withoutstrategypattern;

// Need to override drive method as drive capability is not present in sports vehicle
public class OffRoadVehicle extends Vehicle{

    public void drive() {

        System.out.println("Sports drive capability");
    }
}
