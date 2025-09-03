package com.rk.withstrategypattern;

import com.rk.withstrategypattern.strategy.DriveStrategy;
import com.rk.withstrategypattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
