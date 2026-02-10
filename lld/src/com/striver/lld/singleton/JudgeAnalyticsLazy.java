package com.striver.lld.singleton;

// Lazy-loading
// Not thread safe
public class JudgeAnalyticsLazy {

    private static JudgeAnalyticsLazy judgeAnalytics;

    private JudgeAnalyticsLazy(){

    }

    public static JudgeAnalyticsLazy getInstance() {

        if(judgeAnalytics == null) {

            judgeAnalytics = new JudgeAnalyticsLazy();
        }

        return judgeAnalytics;
    }
}

