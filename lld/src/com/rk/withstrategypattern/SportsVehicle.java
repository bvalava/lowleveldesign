package com.rk.withstrategypattern;

import com.rk.withstrategypattern.strategy.DriveStrategy;
import com.rk.withstrategypattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
