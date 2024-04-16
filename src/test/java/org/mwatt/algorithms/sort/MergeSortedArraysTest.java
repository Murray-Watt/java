package org.mwatt.algorithms.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedArraysTest {

    @Test
    public void mergeSortedArraysEmptyArrays() {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {};
        int n = 0;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertEquals(0, nums1.length);
    }

    @Test
    public void mergeSortedArraysNum1Empty() {
        int[] nums1 = {0, 0, 0};
        int m = 0;
        int[] nums2 = {2, 4, 6};
        int n = 3;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{2, 4, 6}, nums1);
    }

    @Test
    public void mergeSortedArraysNum2Empty() {
        int[] nums1 = {1, 3, 5};
        int m = 3;
        int[] nums2 = {};
        int n = 0;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 3, 5}, nums1);
    }

    @Test
    public void mergeSortedArraysNum1Shorter() {
        int[] nums1 = {1, 3, 5, 0 , 0, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 6, 8, 10};
        int n = 5;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 8, 10}, nums1);
    }

    @Test
    public void mergeSortedArraysNum2Shorter() {
        int[] nums1 = {1, 3, 5, 7, 9, 0, 0, 0};
        int m = 5;
        int[] nums2 = {2, 4, 6};
        int n = 3;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 9}, nums1);
    }

    @Test
    public void mergeSortedArraysEqualSizeArrays() {
        int[] nums1 = {1, 3, 5, 7, 9, 0, 0, 0, 0, 0};
        int m = 5;
        int[] nums2 = {2, 4, 6, 8, 10};
        int n = 5;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, nums1);
    }

    @Test
    public void mergeSortedArraysDuplicateValues() {
        int[] nums1 = {1, 3, 5, 0, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 5, 6};
        int n = 4;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 6}, nums1);
    }

    @Test
    public void mergeSortedArraysReverseSortedArrays() {
        int[] nums1 = {1, 3, 5, 7, 9, 0, 0, 0, 0, 0};
        int m = 5;
        int[] nums2 = {2, 4, 6, 8, 10};
        int n = 5;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, nums1);
    }
}
