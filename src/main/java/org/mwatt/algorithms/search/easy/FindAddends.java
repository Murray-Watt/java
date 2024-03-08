package org.mwatt.algorithms.search.easy;

public class FindAddends {
    // Finds two numbers in the given array nums that add up to the target
    // Returns their indices in an array
    // Assumes that there will always be exactly one solution
    public int[] findAddends(int[] nums, int target) {
        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Check all elements after the current element
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of the current element and the other element equals the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices of the two elements
                    return new int[]{i, j};
                }
            }
        }

        // If no two elements were found, return an array with zeros
        return new int[]{0, 0};
    }
}
