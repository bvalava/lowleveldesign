package com.striver.lld.elevator.domain.strategy;

import com.striver.lld.elevator.domain.Elevator;
import com.striver.lld.elevator.domain.InternalRequest;

import java.util.List;

public interface MovementStrategy {

    List<Integer> calculatePath(Elevator elevator, List<InternalRequest> requests);
}
