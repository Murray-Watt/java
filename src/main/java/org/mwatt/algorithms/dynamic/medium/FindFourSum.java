package org.mwatt.algorithms.dynamic.medium;

import java.util.*;

public class FindFourSum {

    class PairOfInts {
        Integer first;
        Integer seconds;

        public PairOfInts(Integer first, Integer seconds) {
            if (first > seconds) {
                this.first = seconds;
                this.seconds = first;
            } else {
                this.first = first;
                this.seconds = seconds;
           }
    }


    public static Map<Integer, Integer> removeBeyondFour(int[] nums, int target) {

        Map<Integer, Integer> numCountMap = new HashMap<>();
        int slow = 0, count = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                numCountMap.put(nums[slow], count);
                nums[slow] = nums[fast];
                count = 1;
            } else if (count < 5) {
                slow++;
                nums[slow] = nums[fast];
                count++;
            }
        }

        numCountMap.put(nums[slow], count);
        return numCountMap;
    }


    public List<List<Integer>> fourSum(int[] nums, int target) {

        if (nums == null || nums.length < 4) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        Map sumsOfTwo = new HashMap<Integer, List<PairOfInts>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                PairOfInts pair = new PairOfInts(nums[i], nums[j])

                sumsOfTwo.put(nums[i] + nums[j], new PairOfInts(nums[i], nums[j]));
            }
        }


        Set<List<Integer>> quads = new HashSet<>();


        List<List<Integer>> result = new ArrayList<>();
        result.addAll(quads);

        return result;
    }
}
