package org.mwatt.algorithms.dynamic.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumFinder {
    // Finds two numbers in the given array nums that add up to the target
    // Returns their indices in an array
    // Assumes that there will always be exactly one solution
    public static int[] findTwoSumN2(int[] nums, int target) {
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
        return new int[]{};
    }

    public static int[] findTwoSumN(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                return new int[] { map.get(remainder), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
