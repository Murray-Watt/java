package org.mwatt.algorithms.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveZerosTest {
    @Test
    public void testMoveZeroes1() {
        int[] nums = {1, 3, 12, 0, 0};
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void testMoveZeroes2() {
        int[] nums = {0};
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    public void testMoveZeroes3() {
        int[] nums = {1, 0};
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 0}, nums);
    }

    @Test
    public void testMoveZeroes4() {
        int[] nums = {2, 1};
        MoveZeros.moveZeroes(nums);
        assertArrayEquals(new int[]{2, 1}, nums);
    }
}