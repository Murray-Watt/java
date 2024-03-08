package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
            int i = 0;
            // Simulate some work being done
            while (!Thread.currentThread().isInterrupted()) {
                i++;

                if (i % 1000 == 0) {
                    System.out.println(STR."i = \{i}");
                }
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

    /**
     * Demonstrates joining two threads sequentially.
     */
    @Test
    public void threadJoin() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 1 completed");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 2 completed");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        assertFalse(thread1.isAlive());
        assertFalse(thread2.isAlive());
    }

    /**
     * Demonstrates using joinAll to join multiple threads.
     * <p>
     * When joining threads sequentially, if a thread that takes longer to complete
     * is not the last one to be joined, the join operation on the shorter threads
     * will return immediately. This is because the time spent waiting for the shorter
     * threads to complete would be part of the total time spent waiting for the longer
     * running thread. Joining threads in a loop allows for all threads to be joined
     * regardless of their individual execution times.
     */
    @Test
    public void joinAllUsingAForLoop() throws InterruptedException {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                System.out.println(STR."Thread \{Thread.currentThread().threadId()} started");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println(STR."Thread \{Thread.currentThread().threadId()} completed");
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
            assertFalse(thread.isAlive());
        }
    }

    /**
     * Demonstrates using sleep to pause the current thread.
     */
    @Test
    public void threadSleep() throws InterruptedException {
        System.out.println("Thread started");
        Thread.sleep(1000);
        System.out.println("Thread completed");

        assertFalse(Thread.currentThread().isAlive());
    }

    /**
     * Demonstrates forking a new thread.
     */
    @Test
    public void forking() {
        Thread thread = new Thread(() -> {
            System.out.println("Thread started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread completed");
        });

        thread.start();

        assertTrue(thread.isAlive());
    }
}
