package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExecutorTest {
    private static class MyRunnable implements Runnable {
        private boolean hasRun;

        public boolean hasRun() {
            return hasRun;
        }

        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
            hasRun = true;
        }
    }

    private static class MyExecutor implements Executor {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    @Test
    public void runsRunnable() {
        MyRunnable myRunnable = new MyRunnable();
        assertFalse(myRunnable.hasRun());

        MyExecutor myExecutor = new MyExecutor();
        myExecutor.execute(myRunnable);

        assertTrue(myRunnable.hasRun());
    }
}
