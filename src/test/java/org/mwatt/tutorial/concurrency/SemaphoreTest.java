package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Examples demonstrating the use of the Semaphore class for managing permits
 * for execution.
 */
public class SemaphoreTest {

    /**
     * Inner class that subclasses Semaphore to demonstrate reducing permits
     * after each release.
     */
    private static class CustomSemaphore extends Semaphore {
        public CustomSemaphore(int permits) {
            super(permits);
        }

        // Reduces permits by 1 after each release
        @Override
        public void release() {
            super.release();
            reducePermits(1);
        }
    }

    /**
     * Demonstrates acquiring and releasing permits from a semaphore.
     */
    @Test
    void acquireAndReleasePermits() {
        Semaphore semaphore = new CustomSemaphore(3);
        assertDoesNotThrow(() -> semaphore.acquire());
        semaphore.release();
        assertEquals(2, semaphore.availablePermits());
    }

    @Test
    public void canAcquire() {
        Semaphore semaphore = new Semaphore(1);

        // Try to acquire the semaphore
        assertTrue(semaphore.tryAcquire());

        // Release the semaphore
        semaphore.release();

        // Try to acquire the semaphore again
        assertTrue(semaphore.tryAcquire());
    }

    @Test
    public void cannotAcquireUntilRelease() throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);

        // Acquire the semaphore
        semaphore.acquire();

        // Try to acquire the semaphore, which should fail
        assertFalse(semaphore.tryAcquire());

        // Release the semaphore
        semaphore.release();

        // Try to acquire the semaphore again, which should succeed
        assertTrue(semaphore.tryAcquire());
    }

    /**
     * Demonstrates acquiring multiple permits from a semaphore.
     */
    @Test
    void acquireMultiplePermits() {
        Semaphore semaphore = new Semaphore(2);
        assertDoesNotThrow(() -> semaphore.acquire(2));
    }

    /**
     * Demonstrates acquiring permits from a semaphore with a timeout.
     */
    @Test
    void acquirePermitsWithTimeout() {
        Semaphore semaphore = new Semaphore(1);
        assertDoesNotThrow(() -> semaphore.tryAcquire(1, TimeUnit.SECONDS));
    }

    /**
     * Demonstrates checking the number of available permits in a semaphore.
     */
    @Test
    void availablePermits() {
        Semaphore semaphore = new Semaphore(2);
        assertEquals(2, semaphore.availablePermits());
    }

    /**
     * Demonstrates draining permits from a semaphore.
     */
    @Test
    void drainPermits() {
        Semaphore semaphore = new Semaphore(2);
        assertEquals(2, semaphore.drainPermits());
    }

    /**
     * Demonstrates checking if there are queued threads waiting for permits.
     */
    @Test
    void hasQueuedThreads() {
        Semaphore semaphore = new Semaphore(1);
        semaphore.acquireUninterruptibly();
        assertTrue(semaphore.hasQueuedThreads());
    }

    /**
     * Demonstrates getting the number of threads queued for permits.
     */
    @Test
    void getQueueLength() {
        Semaphore semaphore = new Semaphore(1);
        semaphore.acquireUninterruptibly();
        assertEquals(1, semaphore.getQueueLength());
    }

    /**
     * Demonstrates checking if the semaphore was created with fair ordering.
     * Fair ordering means that the longest-waiting thread will be the first
     * to acquire the semaphore.
     */
    @Test
    void isFair() {
        Semaphore semaphore = new Semaphore(1, true);
        assertTrue(semaphore.isFair());
    }
}
