package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FutureTest {
    @Test
    public void future() throws InterruptedException, ExecutionException {
        try (ExecutorService executorService = Executors.newFixedThreadPool(10)) {
            // Submit a task to the executor service
            Future<Boolean> future = executorService.submit(() -> {
                try {
                    // Simulate some work being done
                    Thread.sleep(100L);
                } catch (InterruptedException _) {
                    // Handle interruption
                }

                // Return the result
                return true;
            });

            // Wait for the task to complete and get the result
            Boolean result = future.get();

            // Ensure that the result is true, indicating that the task has run
            assertTrue(result);
        }
    }
}
