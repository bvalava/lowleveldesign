package com.striver.lld.factory;

import java.util.Objects;

public class LogisticsFactory {

    public static Logistics getLogistics(String mode) {

        if (Objects.equals(mode, "road")) {

            return new Road();
        }

        return new Air();
    }
}
