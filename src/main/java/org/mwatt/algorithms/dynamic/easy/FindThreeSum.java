package org.mwatt.algorithms.dynamic.easy;

public class FindThreeSum {
    // Finds two numbers in the given array nums that add up to the target
    // Returns their indices in an array
    // Assumes that there will always be exactly one solution
    public int[] findThreeSum(int[] nums, int target) {
        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Check all pairs of elements after the current element
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // If the sum of the current element and the other elements equals the target
                    if (nums[i] + nums[j] + nums[k] == target) {
                        // Return the indices of the three elements
                        return new int[]{i, j, k};
                    }
                }
            }
        }

        // If no three elements were found, return an array with zeros
        return new int[]{0, 0, 0};
    }
}
