package org.mwatt.tutorial.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionalOperatorsTest {

    @Test
    public void conditionalAnd() {
        assertFalse(false && false);
        assertFalse(false && true);
        assertFalse(true && false);
        assertTrue(true && true);
    }

    @Test
    public void conditionalOr() {
        assertFalse(false || false);
        assertTrue(false || true);
        assertTrue(true || false);
        assertTrue(true || true);
    }

    @Test
    public void conditionalNot() {
        assertTrue(!false);
        assertFalse(!true);
    }

    @Test
    public void conditionalAndShortCircuit() {
        int a = 10;

        assertTrue(a-- > 5 && a-- < 15);
        assertEquals(8, a);
    }

    @Test
    public void conditionalOrShortCircuit() {
        int a = 10;

        assertTrue(a-- > 5 || a-- < 15);
        assertEquals(9, a);
    }
}
