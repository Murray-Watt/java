package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.StampedLock;

import static org.junit.jupiter.api.Assertions.*;

public class StampedLockTest {
    @Test
    void stampedLockBasics() {
        StampedLock lock = new StampedLock();
        long stamp = lock.writeLock();
        lock.unlockWrite(stamp);
    }

    @Test
    void tryWriteLock() {
        StampedLock lock = new StampedLock();
        long stamp = lock.tryWriteLock();
        assertNotEquals(0L, stamp);
        lock.unlockWrite(stamp);
    }

    @Test
    void tryReadLock() {
        StampedLock lock = new StampedLock();
        long stamp = lock.tryReadLock();
        assertNotEquals(0L, stamp);
        lock.unlockRead(stamp);
    }

    @Test
    void tryOptimisticRead() {
        StampedLock lock = new StampedLock();
        long stamp = lock.tryOptimisticRead();
        assertTrue(lock.validate(stamp));
    }

    @Test
    void convertToReadLock() {
        StampedLock lock = new StampedLock();
        long stamp = lock.tryOptimisticRead();
        long readStamp = lock.tryConvertToReadLock(stamp);
        assertNotEquals(0L, readStamp);
        lock.unlockRead(readStamp);
    }

    @Test
    void convertToWriteLock() {
        StampedLock lock = new StampedLock();
        long stamp = lock.tryOptimisticRead();
        long writeStamp = lock.tryConvertToWriteLock(stamp);
        assertNotEquals(0L, writeStamp);
        lock.unlockWrite(writeStamp);
    }

    @Test
    void tryWriteLockAfterOptimisticRead() {
    }

    @Test
    void tryOptimisticReadAfterWriteLock() {
        StampedLock lock = new StampedLock();
        long stamp = lock.writeLock();
        long optimisticStamp = lock.tryOptimisticRead();
        assertEquals(0L, optimisticStamp);
        lock.unlockWrite(stamp);
    }
}
