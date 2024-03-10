package org.mwatt.tutorial.concurrency;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

public class AtomicOperationsTest {

    @Test
    void testAtomicBoolean() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        assertFalse(atomicBoolean.get());
        assertTrue(atomicBoolean.compareAndSet(false, true));
        assertTrue(atomicBoolean.get());
    }

    @Test
    void testAtomicInteger() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        assertEquals(0, atomicInteger.get());
        assertTrue(atomicInteger.compareAndSet(0, 1));
        assertEquals(1, atomicInteger.get());
        assertEquals(2, atomicInteger.incrementAndGet());
        assertEquals(2, atomicInteger.getAndIncrement());
        assertEquals(2, atomicInteger.get());
    }

    @Test
    void testAtomicLong() {
        AtomicLong atomicLong = new AtomicLong(0L);
        assertEquals(0L, atomicLong.get());
        assertTrue(atomicLong.compareAndSet(0L, 1L));
        assertEquals(1L, atomicLong.get());
        assertEquals(2L, atomicLong.incrementAndGet());
        assertEquals(2L, atomicLong.getAndIncrement());
        assertEquals(2L, atomicLong.get());
    }
}
