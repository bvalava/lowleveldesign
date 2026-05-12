package com.striver.lld.elevator.domain.strategy;

import com.striver.lld.elevator.domain.Elevator;
import com.striver.lld.elevator.domain.ExternalRequest;

import java.util.List;

public interface ElevatorSelectionStrategy {

    Elevator selectElevator(ExternalRequest request, List<Elevator> availableElevators);
}
