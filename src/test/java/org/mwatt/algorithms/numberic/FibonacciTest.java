package org.mwatt.algorithms.numberic;

import org.junit.jupiter.api.Test;
import org.mwatt.algorithms.dynamic.easy.Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void fibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fibonacciRecursive(0));
        assertEquals(1, fibonacci.fibonacciRecursive(1));
        assertEquals(1, fibonacci.fibonacciRecursive(2));
        assertEquals(2, fibonacci.fibonacciRecursive(3));
        assertEquals(3, fibonacci.fibonacciRecursive(4));
        assertEquals(5, fibonacci.fibonacciRecursive(5));
        assertEquals(8, fibonacci.fibonacciRecursive(6));
        assertEquals(13, fibonacci.fibonacciRecursive(7));
        assertEquals(21, fibonacci.fibonacciRecursive(8));
        assertEquals(34, fibonacci.fibonacciRecursive(9));
        assertEquals(55, fibonacci.fibonacciRecursive(10));
    }

    @Test
    public void fibonacciDynamicProgramming() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fibonacciDynamicProgramming(0));
        assertEquals(1, fibonacci.fibonacciDynamicProgramming(1));
        assertEquals(1, fibonacci.fibonacciDynamicProgramming(2));
        assertEquals(2, fibonacci.fibonacciDynamicProgramming(3));
        assertEquals(3, fibonacci.fibonacciDynamicProgramming(4));
        assertEquals(5, fibonacci.fibonacciDynamicProgramming(5));
        assertEquals(8, fibonacci.fibonacciDynamicProgramming(6));
        assertEquals(13, fibonacci.fibonacciDynamicProgramming(7));
        assertEquals(21, fibonacci.fibonacciDynamicProgramming(8));
        assertEquals(34, fibonacci.fibonacciDynamicProgramming(9));
        assertEquals(55, fibonacci.fibonacciDynamicProgramming(10));
    }

    @Test
    public void fibDynamicProgrammingSpaceOptimized() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fibDynamicProgrammingSpaceOptimized(0));
        assertEquals(1, fibonacci.fibDynamicProgrammingSpaceOptimized(1));
        assertEquals(1, fibonacci.fibDynamicProgrammingSpaceOptimized(2));
        assertEquals(2, fibonacci.fibDynamicProgrammingSpaceOptimized(3));
        assertEquals(3, fibonacci.fibDynamicProgrammingSpaceOptimized(4));
        assertEquals(5, fibonacci.fibDynamicProgrammingSpaceOptimized(5));
        assertEquals(8, fibonacci.fibDynamicProgrammingSpaceOptimized(6));
        assertEquals(13, fibonacci.fibDynamicProgrammingSpaceOptimized(7));
        assertEquals(21, fibonacci.fibDynamicProgrammingSpaceOptimized(8));
        assertEquals(34, fibonacci.fibDynamicProgrammingSpaceOptimized(9));
        assertEquals(55, fibonacci.fibDynamicProgrammingSpaceOptimized(10));
    }
}