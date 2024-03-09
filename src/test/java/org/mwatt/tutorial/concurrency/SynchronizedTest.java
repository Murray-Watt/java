package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;
import org.mwatt.patterns.LazySingleton;

public class SynchronizedTest {
    private static final Object syncObject = new Object();
    private static int count = 0;


    @Test
    void synchronizedBlock() {
        // Increment count using a synchronized block
        synchronized (syncObject) {
            count++;
        }
    }

    @Test
    void synchronizedMethod() {
        // Increment count using a synchronized method
        incrementCount();
    }

    private synchronized void incrementCount() {
        count++;
    }

    @Test
    void synchronizedClass() {
        // Increment count using a synchronized class method
        SynchronizedTest.incrementCountStatic();
    }

    private static synchronized void incrementCountStatic() {
        // Increment count using a synchronized class method
        count++;
    }

    @Test
    void doubleCheckedLocking() {
        // Double-checked locking for lazy initialization of a singleton
        LazySingleton.getInstance();
    }

    @Test
    void synchronizedExceptionHandling() {
        // Example of using synchronized block for exception handling
        synchronized (syncObject) {
            try {
                // Code that may throw an exception
                throw new RuntimeException("Example exception");
            } catch (Exception _) {
            }
        }
    }

    @Test
    void synchronizedPerformanceImpact() {
        // Example demonstrating the performance impact of synchronized keyword
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            synchronized (syncObject) {
                System.out.println("Synchronized block");
            }
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(STR."Total time taken: \{totalTime} ms");
    }

    @Test
    void synchronizedDeadlock() {
        // Example demonstrating a potential deadlock scenario with synchronized blocks
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                // Critical section of code
                synchronized (lock2) {
                    System.out.println("Thread 1");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                // Critical section of code
                synchronized (lock1) {
                    System.out.println("Thread 2");
                    System.out.println(STR."Count: \{count}");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
