package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExecutorServiceTest {

    private static class MyRunnable implements Runnable {
        private boolean hasRun;

        public boolean hasRun() {
            return hasRun;
        }

        @Override
        public void run() {
            System.out.println(STR."Running in: \{Thread.currentThread().getName()}");
            hasRun = true;
        }
    }

    private static class MyExecutor extends ThreadPoolExecutor {

        public MyExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, java.util.concurrent.TimeUnit unit, java.util.concurrent.BlockingQueue<Runnable> workQueue) {
            super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    @Test
    public void executionServiceRunsRunnable() {
        MyRunnable myRunnable = new MyRunnable();
        assertFalse(myRunnable.hasRun());

        try (ExecutorService myExecutor = new MyExecutor(
                1,
                1,
                0L,
                TimeUnit.MILLISECONDS,
                new java.util.concurrent.LinkedBlockingQueue<>())) {
            myExecutor.execute(myRunnable);
        }

        assertTrue(myRunnable.hasRun());
    }
}
