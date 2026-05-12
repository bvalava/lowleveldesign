package com.striver.lld.elevator.domain.strategy;

import com.striver.lld.elevator.domain.Elevator;
import com.striver.lld.elevator.domain.InternalRequest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FCFSStrategy implements MovementStrategy {

    @Override
    public List<Integer> calculatePath(Elevator elevator, List<InternalRequest> requests) {
        List<Integer> path = new ArrayList<>();

        // Sort by timestamp (FCFS)
        requests.sort(Comparator.comparingLong(InternalRequest::getTimestamp));

        for (InternalRequest request : requests) {
            if (!path.contains(request.getDestinationFloor())) {
                path.add(request.getDestinationFloor());
            }
        }

        return path;
    }
}
