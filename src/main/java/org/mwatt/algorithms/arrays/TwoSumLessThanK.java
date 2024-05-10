package org.mwatt.algorithms.arrays;

import java.util.Arrays;

public class TwoSumLessThanK {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int largestSum = -1;

        int left = 0;
        int right = nums.length -1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum < k) {
                if (largestSum < sum) {
                    largestSum = sum;
                }

                left++;
            } else {
                right--;
                left=0;
            }
        }

        return largestSum;
    }
}
