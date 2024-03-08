package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountDownLatchTest {
    CountDownLatch latch = new CountDownLatch(1);
    private boolean hasRun = false;

    @Test
    public void latch() throws InterruptedException, ExecutionException {
        try (ExecutorService executorService = Executors.newFixedThreadPool(10)) {
            Future<Boolean> future = executorService.submit(() -> {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException _) {
                }
                hasRun = true;
                latch.countDown();
                return hasRun;
            });

            latch.await();
            assertTrue(future.isDone());
            assertTrue(future.get());
        }
    }
}
