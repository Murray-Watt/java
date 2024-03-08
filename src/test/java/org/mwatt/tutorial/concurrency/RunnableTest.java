package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Semaphore;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunnableTest {
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

    @Test
    public void runsRunnable() {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Ensure that the runnable has not yet run
        assertFalse(myRunnable.hasRun());

        // Create a new thread with the MyRunnable instance
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        try {
            // Wait for the thread to finish
            thread.join();
        } catch (InterruptedException _) {
            // Restore the interrupted status of the current thread
            Thread.currentThread().interrupt();
        }

        // Ensure that the runnable has now run
        assertTrue(myRunnable.hasRun());
    }
}
