package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static org.junit.jupiter.api.Assertions.*;

public class ReentrantReadWriteLockTest {
    @Test
    void readLockBlocksWriting() {
    }

    @Test
    void writeLockAndUnlock() {
    }

    @Test
    void tryReadLockSuccess() {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock();

        assertTrue(readLock.tryLock());
        readLock.unlock();
    }

    @Test
    void tryReadLockFailure() {
    }

    // Demonstrates basic locking and unlocking behavior of ReentrantReadWriteLock
    @Test
    void demonstrateReadWriteLock() {
        ReadWriteLock rwLock = new ReentrantReadWriteLock();
        rwLock.writeLock().lock();
        assertTrue(rwLock.writeLock().tryLock());
        rwLock.writeLock().unlock();
    }

    // Demonstrates the tryLock behavior of ReentrantReadWriteLock
    @Test
    void demonstrateTryReadWriteLock() {
        ReadWriteLock rwLock = new ReentrantReadWriteLock();
        assertTrue(rwLock.readLock().tryLock());
        assertFalse(rwLock.writeLock().tryLock());
        rwLock.readLock().unlock();
    }

    @Test
    void demonstrateReadLockBlocksWriting() {
        ReadWriteLock rwLock = new ReentrantReadWriteLock();
        rwLock.readLock().lock();
        assertFalse(rwLock.writeLock().tryLock());
        rwLock.readLock().unlock();
    }

    @Test
    void demonstrateReadLockDoesNotBlockReading() {
        ReadWriteLock rwLock = new ReentrantReadWriteLock();
        rwLock.readLock().lock();
        assertTrue(rwLock.readLock().tryLock());
        rwLock.readLock().unlock();
    }

    @Test
    void demonstrateWriteLockBlocksReading() {
    }

    @Test
    void demonstrateTryLockFailsWhenAnotherThreadHoldsTheLock() throws InterruptedException {
        ReadWriteLock rwLock = new ReentrantReadWriteLock();
        CountDownLatch latch = new CountDownLatch(1);

        // Acquire the write lock in a separate thread
        Thread thread = new Thread(() -> {
            rwLock.writeLock().lock();
            latch.countDown(); // Signal that the lock has been acquired
            try {
                Thread.sleep(500);
            } catch (InterruptedException _) {
                Thread.currentThread().interrupt();
            }
            rwLock.writeLock().unlock(); // Release the lock
        });
        thread.start();

        // Wait for the thread to start
        latch.await();

        // Try to acquire the write lock in the main thread
        assertFalse(rwLock.writeLock().tryLock());

        // Wait for the other thread to release the lock
        Thread.sleep(1000);

        // Now the lock should be available
        assertTrue(rwLock.writeLock().tryLock());
        rwLock.writeLock().unlock();
    }
}
