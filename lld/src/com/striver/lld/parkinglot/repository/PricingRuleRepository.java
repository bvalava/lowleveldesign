package com.striver.lld.parkinglot.repository;

import com.striver.lld.parkinglot.domain.PricingRule;
import com.striver.lld.parkinglot.domain.Vehicle;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class PricingRuleRepository {

    private final Map<UUID, PricingRule> rules = new ConcurrentHashMap<>();
    private final Map<Vehicle.VehicleType, UUID> vehicleTypeToRule = new ConcurrentHashMap<>();

    public PricingRule save(PricingRule rule) {

        rules.put(rule.getId(), rule);
        vehicleTypeToRule.put(rule.getVehicleType(), rule.getId());

        return rule;
    }

    public Optional<PricingRule> findById(UUID ruleId) {

        return Optional.ofNullable(rules.get(ruleId));
    }

    public Optional<PricingRule> findByVehicleType(Vehicle.VehicleType vehicleType) {

        UUID ruleId = vehicleTypeToRule.get(vehicleType);
        return ruleId != null ? Optional.ofNullable(rules.get(ruleId)) : Optional.empty();
    }

    public List<PricingRule> findAll() {

        return new ArrayList<>(rules.values());
    }

    public void update(PricingRule rule) {

        if (rules.containsKey(rule.getId())) {

            rules.put(rule.getId(), rule);
            vehicleTypeToRule.put(rule.getVehicleType(), rule.getId());
        }
    }

    public void delete(UUID ruleId) {

        PricingRule pricingRule = rules.remove(ruleId);
        if (pricingRule != null) {

            vehicleTypeToRule.remove(pricingRule.getVehicleType());
        }
    }

    public void clear() {

        rules.clear();
        vehicleTypeToRule.clear();
    }
}
