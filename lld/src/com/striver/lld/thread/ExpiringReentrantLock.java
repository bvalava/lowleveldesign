package com.striver.lld.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ExpiringReentrantLock {

    // underlying mutual-exclusion lock
    private final ReentrantLock lock = new ReentrantLock();

    // single-thread scheduler to run the expiry task
    private final ScheduledExecutorService scheduler =
            Executors.newSingleThreadScheduledExecutor();

    // flag that tells the expiry task a timed lock is still active
    private volatile boolean isLocked = false;

    // Tries to acquire immediately; if successful, schedules auto-unlock
    public boolean tryLockWithExpiry(long timeoutMillis) {

        // attempt immediate acquisition
        boolean acquired = lock.tryLock();
        if (acquired) {
            // mark as held under the timer
            isLocked = true;

            // schedule unlock after timeout
            scheduler.schedule(() -> {
                if (lock.isHeldByCurrentThread() || isLocked) {
                    System.out.println("Auto-releasing lock after timeout.");
                    unlockSafely(); // delegate to common unlock logic
                }
            }, timeoutMillis, TimeUnit.MILLISECONDS);
        }
        return acquired;
    }

    // Releases the lock either by the owner thread or the timer
    public void unlockSafely() {
        if (lock.isHeldByCurrentThread() || isLocked) {
            isLocked = false; // reset timer flag

            // only the owner may actually call unlock()
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
                System.out.println("Lock released.");
            }
        }
    }

    // Graceful shutdown for the scheduler
    public void shutdown() {
        scheduler.shutdownNow();
    }
}
