package com.rk.withstrategypattern;

import com.rk.withstrategypattern.strategy.DriveStrategy;
import com.rk.withstrategypattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
