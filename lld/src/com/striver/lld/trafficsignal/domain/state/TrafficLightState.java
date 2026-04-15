package com.striver.lld.trafficsignal.domain.state;

import com.striver.lld.trafficsignal.domain.TrafficLight;

public interface TrafficLightState {

    void turnGreen(TrafficLight trafficLight);
    void turnYellow(TrafficLight trafficLight);
    void turnRed(TrafficLight trafficLight);
    void turnOff(TrafficLight trafficLight);
    String getStateName();
    boolean canTransitionTo(TrafficLightState newState);
}
