package org.mwatt.algorithms.sort;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastM = m - 1;
        int lastN = n - 1;
        int last = m + n - 1;

        for (int i = last; i >= 0; i--) {
            if (lastM < 0) {
                nums1[i] = nums2[lastN];
                lastN--;
            } else if (lastN < 0) {
                break;
            } else if (nums1[lastM] > nums2[lastN]) {
                nums1[i] = nums1[lastM];
                lastM--;
            } else {
                nums1[i] = nums2[lastN];
                lastN--;
            }
        }
    }
}
