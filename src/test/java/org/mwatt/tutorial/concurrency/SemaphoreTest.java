package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Semaphore;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SemaphoreTest {

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
}
