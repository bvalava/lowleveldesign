package com.striver.lld.dip;

public class RecommendationAlgo {

    private RecommendationStrategy strategy;

    public RecommendationAlgo(RecommendationStrategy strategy) {

        this.strategy = strategy;
    }

    public void recommend(){

        strategy.recommend();
    }
}
