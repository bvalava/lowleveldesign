package com.striver.lld.hotel.repository;

import com.striver.lld.hotel.domain.CancellationPolicy;

import java.util.Optional;

public interface CancellationPolicyRepository {

    CancellationPolicy save(CancellationPolicy policy);

    Optional<CancellationPolicy> findById(String policyId);
}
