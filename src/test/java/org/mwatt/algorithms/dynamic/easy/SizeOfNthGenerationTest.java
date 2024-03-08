package org.mwatt.algorithms.dynamic.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps.
    In how many distinct ways can you climb to the top?
 */
class sizeOfNthPascalsTriangleTest {

    @Test
    void sizeOfNthPascalsTriangleRecursive() {
        StaircaseClimbing sizeOfNthPascalsTriangle = new StaircaseClimbing();
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbRecursive(1),1);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbRecursive(2),2);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbRecursive(3), 3);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbRecursive(4), 5);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbRecursive(5), 8);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbRecursive(6), 13);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbRecursive(7), 21);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbRecursive(8), 34);
    }

    @Test
    void sizeOfNthPascalsTriangleDynamicProgramming() {
        StaircaseClimbing sizeOfNthPascalsTriangle = new StaircaseClimbing();
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbDynamicProgramming(1),1);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbDynamicProgramming(2),2);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbDynamicProgramming(3), 3);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbDynamicProgramming(4), 5);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbDynamicProgramming(5), 8);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbDynamicProgramming(6), 13);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbDynamicProgramming(7), 21);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbDynamicProgramming(8), 34);
    }

    @Test
    void sizeOfNthPascalsTriangleDynamicProgrammingSpaceOptimized() {
        StaircaseClimbing sizeOfNthPascalsTriangle = new StaircaseClimbing();
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbSpaceOptimized(1),1);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbSpaceOptimized(2),2);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbSpaceOptimized(3), 3);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbSpaceOptimized(4), 5);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbSpaceOptimized(5), 8);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbSpaceOptimized(6), 13);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbSpaceOptimized(7), 21);
        assertEquals(sizeOfNthPascalsTriangle.waysToClimbSpaceOptimized(8), 34);
    }

}