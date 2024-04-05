package org.mwatt.algorithms.dynamic.medium;

import java.util.*;

public class FourSumFinder {

    static public List<List<Integer>> twoSum(int[] nums, long target, int start) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer,Integer> seenAt = new HashMap<>();

        for (int c = start; c < nums.length; ++c) {
            int complement = (int) -(target + nums[c]);

            if (seenAt.containsKey(complement)) {
                res.add(Arrays.asList(complement, nums[c]));

                while (c + 1 < nums.length && nums[c] == nums[c + 1]) {
                    c++;
                }
            }

            seenAt.put(nums[c],c);
        }

        return res;
    }

    static public List<List<Integer>> fourSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> solutions = new ArrayList<>();

        for (int a = 0; a < nums.length - 3; a++) {
            for (int b = a + 1; b < nums.length - 2; b++) {
                var twoSums = twoSum(nums, nums[a] + nums[b], b + 1);

                for (var twoSum : twoSums) {
                    List<Integer> quad = new ArrayList<>(4);
                    quad.add(nums[a]);
                    quad.add(nums[b]);
                    quad.addAll(twoSum);
                    Collections.sort(quad);
                    solutions.add(quad);
                }

                while (b + 1 < nums.length && nums[b] == nums[b + 1]) {
                    b++;
                }
            }

            while (a + 1 < nums.length && nums[a] == nums[a + 1]) {
                a++;
            }
        }

        return solutions;
    }
}

