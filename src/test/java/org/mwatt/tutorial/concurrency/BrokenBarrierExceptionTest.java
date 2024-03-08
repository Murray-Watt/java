package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BrokenBarrierExceptionTest {

    @Test
    public void brokenBarrierException() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

        // Start two threads that will wait at the barrier
        Thread thread1 = new Thread(() -> {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        // Start the first two threads
        thread1.start();
        thread2.start();

        // Wait for the remaining threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Attempt to await the barrier again, which should throw a BrokenBarrierException
        assertThrows(BrokenBarrierException.class, () -> cyclicBarrier.await());
    }
}
