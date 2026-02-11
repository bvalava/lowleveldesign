package com.striver.lld.strategy;

public class RideMatchingService {

    private MatchingStrategy strategy;

    // Constructor injection of strategy
    public RideMatchingService(MatchingStrategy strategy) {
        this.strategy = strategy;
    }

    // Setter injection for changing strategy dynamically
    public void setStrategy(MatchingStrategy strategy) {
        this.strategy = strategy;
    }

    // Delegates the matching logic to the strategy
    public void matchRider(String location) {
        strategy.match(location);
    }
}
