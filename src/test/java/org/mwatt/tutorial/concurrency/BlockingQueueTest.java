package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Examples demonstrating the use of the BlockingQueue class for managing
 * a blocking queue of elements.
 */
public class BlockingQueueTest {

    // Support object for tests
    private static final String DUMMY_ELEMENT = "dummy";

    /**
     * Demonstrates adding an element to the queue.
     */
    @Test
    void addElementToQueue() {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        assertDoesNotThrow(() -> queue.add(DUMMY_ELEMENT));
    }

    /**
     * Demonstrates removing an element from the queue.
     */
    @Test
    void removeElementFromQueue() {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add(DUMMY_ELEMENT);
        assertEquals(DUMMY_ELEMENT, queue.remove());
    }

    /**
     * Demonstrates checking if the queue is empty.
     */
    @Test
    void checkIfQueueIsEmpty() {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add(DUMMY_ELEMENT);
        assertFalse(queue.isEmpty());
    }

    /**
     * Demonstrates retrieving an element from the queue without removing it.
     */
    @Test
    void peekAtElementInQueue() {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add(DUMMY_ELEMENT);
        assertEquals(DUMMY_ELEMENT, queue.peek());
    }

    /**
     * Demonstrates waiting for a specified time to add an element to the queue.
     */
    @Test
    void offerElementToQueueWithTimeout() {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(1);
        assertDoesNotThrow(() -> queue.offer(DUMMY_ELEMENT, 1, TimeUnit.SECONDS));
    }
}
