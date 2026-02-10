package com.striver.lld.singleton;

public class JudgeAnalyticsBillPugh {

    private JudgeAnalyticsBillPugh(){

    }

    private static class Holder {

        private static final JudgeAnalyticsBillPugh judgeAnalytics = new JudgeAnalyticsBillPugh();
    }

    // Double check locking
    public static JudgeAnalyticsBillPugh getInstance() {

        return Holder.judgeAnalytics;
    }
}
