package org.mwatt.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairsDivisibleBy60Test {

    @Test
    public void testNumPairsDivisibleBy60() {
        PairsDivisibleBy60 pairsDivisibleBy60 = new PairsDivisibleBy60();
        int[] time = {30, 20, 150, 100, 40};
        assertEquals(3, pairsDivisibleBy60.numPairsDivisibleBy60(time));
    }

    @Test
    public void testNumPairsDivisibleBy60_2() {
        PairsDivisibleBy60 pairsDivisibleBy60 = new PairsDivisibleBy60();
        int[] time = {60, 60, 60};
        assertEquals(3, pairsDivisibleBy60.numPairsDivisibleBy60(time));
    }
}