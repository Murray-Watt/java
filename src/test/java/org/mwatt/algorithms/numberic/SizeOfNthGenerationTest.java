package org.mwatt.algorithms.numberic;

import org.junit.jupiter.api.Test;
import org.mwatt.algorithms.dynamic.easy.SizeOfNthGeneration;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps.
    In how many distinct ways can you climb to the top?
 */
class SizeOfNthGenerationTest {

    @Test
    void sizeOfNthGenerationRecursive() {
        SizeOfNthGeneration sizeOfNthGeneration = new SizeOfNthGeneration();
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationRecursive(1),1);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationRecursive(2),2);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationRecursive(3), 3);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationRecursive(4), 5);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationRecursive(5), 8);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationRecursive(6), 13);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationRecursive(7), 21);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationRecursive(8), 34);
    }

    @Test
    void sizeOfNthGenerationDynamicProgramming() {
        SizeOfNthGeneration sizeOfNthGeneration = new SizeOfNthGeneration();
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationDynamicProgramming(1),1);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationDynamicProgramming(2),2);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationDynamicProgramming(3), 3);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationDynamicProgramming(4), 5);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationDynamicProgramming(5), 8);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationDynamicProgramming(6), 13);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationDynamicProgramming(7), 21);
        assertEquals(sizeOfNthGeneration.sizeOfNthGenerationDynamicProgramming(8), 34);
    }

    @Test
    void sizeOfNthGenerationDynamicProgrammingSpaceOptimized() {
        SizeOfNthGeneration sizeOfNthGeneration = new SizeOfNthGeneration();
        assertEquals(sizeOfNthGeneration.sizeOfNthGeneration(1),1);
        assertEquals(sizeOfNthGeneration.sizeOfNthGeneration(2),2);
        assertEquals(sizeOfNthGeneration.sizeOfNthGeneration(3), 3);
        assertEquals(sizeOfNthGeneration.sizeOfNthGeneration(4), 5);
        assertEquals(sizeOfNthGeneration.sizeOfNthGeneration(5), 8);
        assertEquals(sizeOfNthGeneration.sizeOfNthGeneration(6), 13);
        assertEquals(sizeOfNthGeneration.sizeOfNthGeneration(7), 21);
        assertEquals(sizeOfNthGeneration.sizeOfNthGeneration(8), 34);
    }

}