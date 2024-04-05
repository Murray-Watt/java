package org.mwatt.algorithms.dynamic.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindFourSumTest {
    @Test
    public void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> result = FourSumFinder.fourSum(nums);

        // Assert that the result is as expected
        assertEquals(3, result.size());
        // Add more assertions as needed
    }

    @Test
    public void fourSumWithNegativeNumbers() {
        int[] nums = {-2, -1, 0, 0, 1, 2};
        List<List<Integer>> result = FourSumFinder.fourSum(nums);

        // Assert that the result is as expected
        assertEquals(3, result.size());
        // Add more assertions as needed
    }

    @Test
    public void fourSumCase3() {
        int[] nums = {-4,-3,-2,-1,0,0,1,2,3,4};
        List<List<Integer>> result = FourSumFinder.fourSum(nums);

        // Assert that the result is as expected
        assertEquals(16, result.size());
        // Add more assertions as needed
    }
}