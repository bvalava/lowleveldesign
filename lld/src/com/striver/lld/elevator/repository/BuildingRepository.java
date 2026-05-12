package com.striver.lld.elevator.repository;

import com.striver.lld.elevator.domain.Building;

import java.util.List;
import java.util.Optional;

public interface BuildingRepository {

    Building save(Building building);
    Optional<Building> findById(String buildingId);
    List<Building> findAll();
    void deleteById(String buildingId);
}
