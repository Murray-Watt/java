package org.mwatt.algorithms.dynamic.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps.
    In how many distinct ways can you climb to the top?
 */
class StaircaseClimbingTest {

    @Test
    void waysToClimbToTheNthStairRecursive() {
        StaircaseClimbing waysToClimbToTheNthStair = new StaircaseClimbing();
        assertEquals(waysToClimbToTheNthStair.waysToClimbRecursive(1),1);
        assertEquals(waysToClimbToTheNthStair.waysToClimbRecursive(2),2);
        assertEquals(waysToClimbToTheNthStair.waysToClimbRecursive(3), 3);
        assertEquals(waysToClimbToTheNthStair.waysToClimbRecursive(4), 5);
        assertEquals(waysToClimbToTheNthStair.waysToClimbRecursive(5), 8);
        assertEquals(waysToClimbToTheNthStair.waysToClimbRecursive(6), 13);
        assertEquals(waysToClimbToTheNthStair.waysToClimbRecursive(7), 21);
        assertEquals(waysToClimbToTheNthStair.waysToClimbRecursive(8), 34);
    }

    @Test
    void waysToClimbToTheNthStairDynamicProgramming() {
        StaircaseClimbing waysToClimbToTheNthStair = new StaircaseClimbing();
        assertEquals(waysToClimbToTheNthStair.waysToClimbDynamicProgramming(1),1);
        assertEquals(waysToClimbToTheNthStair.waysToClimbDynamicProgramming(2),2);
        assertEquals(waysToClimbToTheNthStair.waysToClimbDynamicProgramming(3), 3);
        assertEquals(waysToClimbToTheNthStair.waysToClimbDynamicProgramming(4), 5);
        assertEquals(waysToClimbToTheNthStair.waysToClimbDynamicProgramming(5), 8);
        assertEquals(waysToClimbToTheNthStair.waysToClimbDynamicProgramming(6), 13);
        assertEquals(waysToClimbToTheNthStair.waysToClimbDynamicProgramming(7), 21);
        assertEquals(waysToClimbToTheNthStair.waysToClimbDynamicProgramming(8), 34);
    }

    @Test
    void waysToClimbToTheNthStairDynamicProgrammingSpaceOptimized() {
        StaircaseClimbing waysToClimbToTheNthStair = new StaircaseClimbing();
        assertEquals(waysToClimbToTheNthStair.waysToClimbSpaceOptimized(1),1);
        assertEquals(waysToClimbToTheNthStair.waysToClimbSpaceOptimized(2),2);
        assertEquals(waysToClimbToTheNthStair.waysToClimbSpaceOptimized(3), 3);
        assertEquals(waysToClimbToTheNthStair.waysToClimbSpaceOptimized(4), 5);
        assertEquals(waysToClimbToTheNthStair.waysToClimbSpaceOptimized(5), 8);
        assertEquals(waysToClimbToTheNthStair.waysToClimbSpaceOptimized(6), 13);
        assertEquals(waysToClimbToTheNthStair.waysToClimbSpaceOptimized(7), 21);
        assertEquals(waysToClimbToTheNthStair.waysToClimbSpaceOptimized(8), 34);
    }

}