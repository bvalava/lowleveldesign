package com.striver.lld.singleton;


// Eager loading and thread-safe
public class JudgeAnalytics {

    private static final JudgeAnalytics judge = new JudgeAnalytics();
    private JudgeAnalytics(){

    }

    public static JudgeAnalytics getInstance() {

        return judge;
    }
}
