package org.mwatt.algorithms.dynamic.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindFourSumTest {
    @Test
    public void fourSum() {
        FindFourSum findFourSum = new FindFourSum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = findFourSum.fourSum(nums, target);

        // Assert that the result is as expected
        assertEquals(3, result.size());
        // Add more assertions as needed
    }

    @Test
    public void fourSumWithNegativeNumbers() {
        FindFourSum findFourSum = new FindFourSum();
        int[] nums = {-2, -1, 0, 0, 1, 2};
        int target = 0;
        List<List<Integer>> result = findFourSum.fourSum(nums, target);

        // Assert that the result is as expected
        assertEquals(3, result.size());
        // Add more assertions as needed
    }

    @Test
    public void fourSumWithLargeNumbers() {
        FindFourSum findFourSum = new FindFourSum();
        int[] nums = {100000000, 100000000, 100000000, 100000000};
        int target = 400000000; // 4 * 100000000
        List<List<Integer>> result = findFourSum.fourSum(nums, target);

        // Assert that the result is as expected
        assertEquals(1, result.size());
        // Add more assertions as needed
    }

    @Test
    public void fourSumDuplicatesOrPermutations() {
        FindFourSum findFourSum = new FindFourSum();
        int[] nums = {1, 1, 1, 1, 1, 1};
        int target = 4;
        List<List<Integer>> result = findFourSum.fourSum(nums, target);

        // Assert that the result is as expected
        assertEquals(1, result.size());
        // Add more assertions as needed
    }

    @Test
    public void fourSumCase3() {
        FindFourSum findFourSum = new FindFourSum();
        int[] nums = {-4,-3,-2,-1,0,0,1,2,3,4};
        int target = 0;
        List<List<Integer>> result = findFourSum.fourSum(nums, target);

        // Assert that the result is as expected
        assertEquals(16, result.size());
        // Add more assertions as needed
    }
}