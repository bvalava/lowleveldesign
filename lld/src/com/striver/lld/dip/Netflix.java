package com.striver.lld.dip;

public class Netflix {

    public static void main(String[] args) {

        RecommendationAlgo algo = new RecommendationAlgo(new TrendingRecommendation());
        algo.recommend();
    }
}
