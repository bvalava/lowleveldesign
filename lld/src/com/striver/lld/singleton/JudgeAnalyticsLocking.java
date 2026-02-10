package com.striver.lld.singleton;

public class JudgeAnalyticsLocking {

    private static volatile JudgeAnalyticsLocking judgeAnalytics;

    private JudgeAnalyticsLocking(){

    }

    // Double check locking
    public static JudgeAnalyticsLocking getInstance() {

        if(judgeAnalytics == null) {

            synchronized (JudgeAnalyticsLocking.class) {

                if (judgeAnalytics == null) {

                    judgeAnalytics = new JudgeAnalyticsLocking();
                }
            }
        }

        return judgeAnalytics;
    }
}
