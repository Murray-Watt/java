package org.mwatt.algorithms.lists;

import java.util.Arrays;

public class ArrayUtils {
    public static int[] nDistinctInts(int[] nums, int maxCount) {
        if (nums == null || nums.length == 0 || maxCount <= 0) {
            return new int[0];
        }

        int slow = 0;
        int count = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                count = 1;
                nums[++slow] = nums[fast];
            } else if (count < maxCount) {
                count++;
                nums[++slow] = nums[fast];
            }
        }

        return Arrays.copyOf(nums, slow + 1);
    }
}
