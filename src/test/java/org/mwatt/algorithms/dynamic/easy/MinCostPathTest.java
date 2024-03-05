package org.mwatt.algorithms.dynamic.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostPathTest {

    @Test
    void minCostRecursive() {
        MinCostPath minCostPath = new MinCostPath();
        assertEquals(4, minCostPath.minCostRecursive(new int[]{1,1,1,1,1,1,1,1}));
        assertEquals(15, minCostPath.minCostRecursive(new int[]{10, 15, 20}));
        assertEquals(6, minCostPath.minCostRecursive(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @Test
    void minCostDynamicProgramming() {
        MinCostPath minCostPath = new MinCostPath();
        assertEquals(4, minCostPath.minCostDynamicProgramming(new int[]{1,1,1,1,1,1,1,1}));
        assertEquals(15, minCostPath.minCostDynamicProgramming(new int[]{10, 15, 20}));
        assertEquals(6, minCostPath.minCostDynamicProgramming(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @Test
    void minCostDynamicProgrammingOptimized() {
        MinCostPath minCostPath = new MinCostPath();
        assertEquals(4, minCostPath.minCostDynamicProgrammingOptimized(new int[]{1,1,1,1,1,1,1,1}));
        assertEquals(15, minCostPath.minCostDynamicProgrammingOptimized(new int[]{10, 15, 20}));
        assertEquals(6, minCostPath.minCostDynamicProgrammingOptimized(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

}