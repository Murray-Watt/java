package org.mwatt.algorithms.dynamic.easy;

import java.util.*;

public class ThreeSumFinder {
    // Finds three numbers in the given array nums that add up to the target
    // Returns their indices in an array
    // Assumes that there will always be exactly one solution
    public static int[] findThreeSum_N3(int[] nums, int target) {
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

    public static int[] findThreeSum_N2(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == target) {
                    return new int[]{i, low, high};
                } else if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return new int[]{0, 0, 0};
    }

    public static List<List<Integer>> findAllThreeSumsHiLow(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> solutions = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> result = Arrays.asList(nums[i], nums[low],nums[high]);
                    solutions.add(result);
                    low++; high--;

                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }

                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                } else if (sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return solutions;
    }

    public static void twoSum(int[] nums, int start, List<List<Integer>> solutions) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = start + 1; i < nums.length; i++) {
            int remainder = -nums[start] - nums[i];
            if (seen.containsKey(remainder)) {
                solutions.add(Arrays.asList(nums[start], nums[i], remainder));
                while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
            seen.put(nums[i], i);
        }
    }

    public static List<List<Integer>> findAllThreeSumsHashMap(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> solutions = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                twoSum(nums, i, solutions);
            }
        }

        return solutions;
    }

    // Same worse case but slower on average
    public static List<List<Integer>> findAllThreeSumsNoSort(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList<>(res);
    }
}
