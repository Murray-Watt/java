package org.mwatt.algorithms.arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int slow = -1;
        int next = 0;

        while (next < nums.length && nums[next] != 0) {
            next++;
        }

        if (next < nums.length) {
            slow = next;
            next++;
        }


        while (next < nums.length) {
            if (nums[next] == 0) {
                next++;
            } else {
                nums[slow] = nums[next];
                slow++;
                next++;
            }
        }

        while (slow < next && slow != -1) {
            nums[slow] = 0;
            slow++;
        }
    }
}
