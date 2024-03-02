package org.mwatt.tutorial.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings({"SimplifiableAssertion", "ConstantValue"})
public class ComparisonOperatorsTest {

    @Test
    public void equals() {
        int a = 10;
        int b = 10;
        int c = 20;

        assertTrue(a == b);
        assertFalse(a == c);
    }

    @Test
    public void notEquals() {
        int a = 10;
        int b = 10;
        int c = 20;

        assertFalse(a != b);
        assertTrue(a != c);
    }

    @Test
    public void greaterThan() {
        int a = 10;
        int b = 10;
        int c = 20;

        assertFalse(a > b);
        assertTrue(c > a);
    }

    @Test
    public void lessThan() {
        int a = 10;
        int b = 10;
        int c = 20;

        assertFalse(a < b);
        assertTrue(a < c);
    }

    @Test
    public void greaterThanEquals() {
        int a = 10;
        int b = 10;
        int c = 20;

        assertTrue(a >= b);
        assertTrue(c >= a);
    }

    @Test
    public void lessThanEquals() {
        int a = 10;
        int b = 10;
        int c = 20;

        assertTrue(a <= b);
        assertTrue(a <= c);
    }
}
