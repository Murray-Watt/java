package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThreadTest {
    private boolean hasRun = false;
    @Test
    public void threadStartAndJoin() throws InterruptedException {
        // Create a new thread
        Thread thread = new Thread(() -> {
            // Simulate some work being done
            try {
                Thread.sleep(100L);
            } catch (InterruptedException _) {
                // Handle interruption
                Thread.currentThread().interrupt();
            }

            // Set the flag to indicate that the task has run
            hasRun = true;
        });

        // Start the thread
        thread.start();

        // Wait for the thread to finish
        thread.join();

        // Ensure that the thread has completed its task
        assertTrue(hasRun);
    }

    @Test
    public void threadInterrupt() throws InterruptedException {
        // Create a new thread
        Thread thread = new Thread(() -> {
            // Simulate some work being done
            while (!Thread.currentThread().isInterrupted()) {
                // Do something
            }
        });

        // Start the thread
        thread.start();

        // Interrupt the thread
        thread.interrupt();

        // Wait for the thread to finish
        thread.join();

        // Ensure that the thread has been interrupted
        assertTrue(thread.isInterrupted());
    }
}
