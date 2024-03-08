package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static class Task implements Runnable {

        private final CyclicBarrier barrier;

        public Task(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException _) {
            }
        }
    }

    @Test
    public void cyclicBarrier() throws BrokenBarrierException, InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
        });

        new Thread(new Task(cyclicBarrier)).start();
        new Thread(new Task(cyclicBarrier)).start();
        new Thread(new Task(cyclicBarrier)).start();

        if (cyclicBarrier.isBroken()) {
            throw new BrokenBarrierException();
        }

        cyclicBarrier.await();

        cyclicBarrier.reset();

        new Thread(new Task(cyclicBarrier)).start();
        new Thread(new Task(cyclicBarrier)).start();
        new Thread(new Task(cyclicBarrier)).start();

        if (cyclicBarrier.isBroken()) {
            throw new BrokenBarrierException();
        }

        cyclicBarrier.await();
    }
}
