package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Examples demonstrating the use of the DelayQueue class, which is a specialized queue implementation
 * for managing elements that have an associated delay for their retrieval.
 */
public class DelayQueueTest {
     // Support object for tests
    private static final DelayedElement DUMMY_ELEMENT = new DelayedElement();

    /**
     * Inner class representing a delayed element.
     */
    private static class DelayedElement implements Delayed {
        private final long delay;

        public DelayedElement() {
            this.delay = 0;
        }

        public DelayedElement(long delay) {
            this.delay = delay;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(delay, TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            long diff = this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS);
            return Long.compare(diff, 0);
        }
    }

    /**
     * Demonstrates adding and retrieving a delayed element from the queue.
     */
    @Test
    void addAndRetrieveDelayedElement() {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        assertDoesNotThrow(() -> queue.put(DUMMY_ELEMENT));
        assertSame(DUMMY_ELEMENT, queue.poll());
    }

    /**
     * Demonstrates waiting for a delayed element to become available in the queue.
     */
    @Test
    void waitForDelayedElement() throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        assertDoesNotThrow(() -> queue.put(new DelayedElement(1000))); // Delay of 1 second
        assertSame(DUMMY_ELEMENT, queue.poll(2, TimeUnit.SECONDS)); // Wait for up to 2 seconds
    }

    /**
     * Demonstrates checking the size of the queue.
     */
    @Test
    void checkQueueSize() {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        queue.put(DUMMY_ELEMENT);
        assertEquals(1, queue.size());
    }

    /**
     * Demonstrates peeking at the next element in the queue without removing it.
     */
    @Test
    void peekAtNextElement() {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        assertDoesNotThrow(() -> queue.put(new DelayedElement(1000))); // Delay of 1 second
        assertNotNull(queue.peek());
    }
}
