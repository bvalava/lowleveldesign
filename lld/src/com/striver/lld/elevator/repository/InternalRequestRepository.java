package com.striver.lld.elevator.repository;

import com.striver.lld.elevator.domain.InternalRequest;
import com.striver.lld.elevator.domain.RequestStatus;

import java.util.List;
import java.util.Optional;

public interface InternalRequestRepository {

    InternalRequest save(InternalRequest request);
    List<InternalRequest> findByElevator(String elevatorId);
    List<InternalRequest> findPendingByElevator(String elevatorId);
    Optional<InternalRequest> findById(String requestId);
    List<InternalRequest> findAll();
    void updateRequestStatus(String requestId, RequestStatus status);
}
