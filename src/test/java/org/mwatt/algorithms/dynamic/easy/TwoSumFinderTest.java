package org.mwatt.algorithms.dynamic.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumFinderTest {

    @Test
    public void findTwoSumsN2() {
        assertArrayEquals(new int[]{0,1}, TwoSumFinder.findTwoSumN2(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1,2}, TwoSumFinder.findTwoSumN2(new int[]{3,2,4}, 6));
        assertArrayEquals(new int[]{0,1}, TwoSumFinder.findTwoSumN2(new int[]{3,3}, 6));
    }

    @Test
    public void findTwoSumsN() {
        assertArrayEquals(new int[]{0,1}, TwoSumFinder.findTwoSumN(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1,2}, TwoSumFinder.findTwoSumN(new int[]{3,2,4}, 6));
        assertArrayEquals(new int[]{0,1}, TwoSumFinder.findTwoSumN(new int[]{3,3}, 6));
    }
}