package com.striver.lld.thread;

import java.util.concurrent.Callable;

public class ETACalculationTask implements Callable<String> {

    public String call() throws InterruptedException {
        Thread.sleep(5000); // Simulate 5-second delay for ETA calculation
        System.out.println("Calculation ETA using Callable.");
        return "ETA: 25 minutes"; // Return the ETA result
    }
}
