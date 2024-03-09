package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ConstantValue")
public class ConditionTest {

    @Test
    void awaitSignal() throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        boolean[] signaled = {false};

        Thread thread = new Thread(() -> {
            lock.lock();
            try {
                signaled[0] = true;
                condition.signal();
            } finally {
                lock.unlock();
            }
        });
        thread.start();

        lock.lock();
        try {
            while (!signaled[0]) {
                condition.await();
            }
            assertTrue(signaled[0]);
        } finally {
            lock.unlock();
        }
    }

    @Test
    void awaitTimeout() throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        long timeout = 1000; // 1 second

        lock.lock();
        try {
            long start = System.currentTimeMillis();
            boolean timedOut = condition.await(timeout, java.util.concurrent.TimeUnit.MILLISECONDS);
            long end = System.currentTimeMillis();

            assertFalse(timedOut);
            assertTrue(end - start >= timeout);
        } finally {
            lock.unlock();
        }
    }

    @Test
    void awaitInterrupt() throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        Thread thread = new Thread(() -> {
            lock.lock();
            try {
                condition.await();
            } catch (InterruptedException e) {
                // Expected interruption
            } finally {
                lock.unlock();
            }
        });
        thread.start();

        // Wait for the thread to start
        Thread.sleep(100);

        thread.interrupt();
        thread.join();

        assertFalse(thread.isAlive());
    }

    @Test
    void awaitUninterruptibly() {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        Thread thread = new Thread(() -> {
            lock.lock();
            try {
                condition.awaitUninterruptibly();
            } finally {
                lock.unlock();
            }
        });
        thread.start();

        assertTrue(thread.isAlive());
        thread.interrupt(); // Should not interrupt the thread
        assertTrue(thread.isAlive());
    }
}
