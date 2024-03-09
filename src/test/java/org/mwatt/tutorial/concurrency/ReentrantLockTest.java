package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReentrantLockTest {

    // Demonstrates the fairness property of ReentrantLock
    @Test
    void demonstrateFairness() {
        Lock fairLock = new ReentrantLock(true);
        Lock unfairLock = new ReentrantLock();
        assertTrue(fairLock.tryLock());
        assertFalse(unfairLock.tryLock());
        fairLock.unlock();
    }

    @Test
    public void lockAndUnlock() {
        Lock lock = new ReentrantLock();
        lock.lock();
        assertTrue(lock.tryLock());
        lock.unlock();
    }

    @Test
    public void tryLock() {
        Lock lock = new ReentrantLock();
        assertTrue(lock.tryLock());
        lock.unlock();
    }

    @Test
    public void lockInterruptibly() throws InterruptedException {
        Lock lock = new ReentrantLock();
        lock.lockInterruptibly();
        assertTrue(lock.tryLock());
        lock.unlock();
    }

    @Test
    public void lockWithTimeout() throws InterruptedException {
        Lock lock = new ReentrantLock();
        assertTrue(lock.tryLock(1000, java.util.concurrent.TimeUnit.MILLISECONDS));
        lock.unlock();
    }

    @Test
    public void lockAndUnlockMultipleTimes() {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        lock.lock();
        lock.unlock();
    }

    @Test
    public void lockInterruptiblyWithTryLock() throws InterruptedException {
        Lock lock = new ReentrantLock();
        lock.lockInterruptibly();
        assertTrue(lock.tryLock());
        lock.unlock();
    }
}

