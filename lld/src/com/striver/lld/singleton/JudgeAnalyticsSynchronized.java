package com.striver.lld.singleton;

public class JudgeAnalyticsSynchronized {

    private static JudgeAnalyticsSynchronized judgeAnalytics;

    private JudgeAnalyticsSynchronized(){

    }

    public static synchronized JudgeAnalyticsSynchronized getInstance() {

        if(judgeAnalytics == null) {

            judgeAnalytics = new JudgeAnalyticsSynchronized();
        }

        return judgeAnalytics;
    }
}
