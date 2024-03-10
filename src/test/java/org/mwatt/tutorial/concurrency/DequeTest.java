package org.mwatt.tutorial.concurrency;

import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class DequeTest {
    @Test
    void addFirstAndRemoveFirst() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        assertEquals(2, deque.removeFirst());
        assertEquals(1, deque.removeFirst());
    }

    @Test
    void offerFirstAndPollFirst() {
        Deque<Integer> deque = new LinkedList<>();
        assertTrue(deque.offerFirst(1));
        assertTrue(deque.offerFirst(2));
        assertEquals(2, deque.pollFirst());
        assertEquals(1, deque.pollFirst());
    }

    @Test
    void addLastAndRemoveLast() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(1);
        deque.addLast(2);
        assertEquals(2, deque.removeLast());
        assertEquals(1, deque.removeLast());
    }

    @Test
    void offerLastAndPollLast() {
        Deque<Integer> deque = new LinkedList<>();
        assertTrue(deque.offerLast(1));
        assertTrue(deque.offerLast(2));
        assertEquals(2, deque.pollLast());
        assertEquals(1, deque.pollLast());
    }

    @Test
    void getFirstAndRemoveFirst() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        assertEquals(2, deque.getFirst());
        assertEquals(2, deque.removeFirst());
    }

    @Test
    void peekFirstAndPollFirst() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        assertEquals(2, deque.peekFirst());
        assertEquals(2, deque.pollFirst());
    }

    @Test
    void getLastAndRemoveLast() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(1);
        deque.addLast(2);
        assertEquals(2, deque.getLast());
        assertEquals(2, deque.removeLast());
    }

    @Test
    void peekLastAndPollLast() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(1);
        deque.addLast(2);
        assertEquals(2, deque.peekLast());
        assertEquals(2, deque.pollLast());
    }
}