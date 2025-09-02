package com.rk.liskov;

public class Car extends EngineVehicle{

    @Override
    public Integer numberOfWheels() {

        return 4;
    }
}
