package org.mwatt.algorithms.dynamic.easy;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumFinderTest {
    @Test
    public void findThreeSumsN3() {
        assertArrayEquals(new int[]{0,1,2}, ThreeSumFinder.findThreeSum_N3(new int[]{2,7,11,15}, 20));
        assertArrayEquals(new int[]{0,1,3}, ThreeSumFinder.findThreeSum_N3(new int[]{2,7,11,15}, 24));
        assertArrayEquals(new int[]{0,1,2}, ThreeSumFinder.findThreeSum_N3(new int[]{3,2,4}, 9));
        assertArrayEquals(new int[]{0,1,2}, ThreeSumFinder.findThreeSum_N3(new int[]{3,3,3}, 9));
    }

    @Test
    public void findThreeSumsN2() {
        assertArrayEquals(new int[]{0,1,2}, ThreeSumFinder.findThreeSum_N2(new int[]{2,7,11,15}, 20));
        assertArrayEquals(new int[]{0,1,3}, ThreeSumFinder.findThreeSum_N2(new int[]{2,7,11,15}, 24));
        assertArrayEquals(new int[]{0,1,2}, ThreeSumFinder.findThreeSum_N2(new int[]{3,2,4}, 9));
        assertArrayEquals(new int[]{0,1,2}, ThreeSumFinder.findThreeSum_N2(new int[]{3,3,3}, 9));
    }

    @Test
    public void findAllThreeSumsHashMap() {
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(-2, 2, 0), Arrays.asList(-1, 1, 0));
        assertEquals(expected1, ThreeSumFinder.findAllThreeSumsHashMap(nums1));

        int[] nums2 = {3, 0, -2, -1, 1, 2};
        List<List<Integer>> expected2 = Arrays.asList(Arrays.asList(-2, 2, 0), Arrays.asList(-2, 3, -1), Arrays.asList(-1, 1, 0));
        assertEquals(expected2, ThreeSumFinder.findAllThreeSumsHashMap(nums2));

        int[] nums3 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected3 = Arrays.asList(Arrays.asList(-1, 1, 0), Arrays.asList(-1, 2, -1));
        assertEquals(expected3, ThreeSumFinder.findAllThreeSumsHashMap(nums3));
    }

    @Test
    public void findAllThreeSumsHiLow() {
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(-2, 0, 2), Arrays.asList(-1, 0, 1));
        assertEquals(expected1, ThreeSumFinder.findAllThreeSumsHiLow(nums1));

        int[] nums2 = {3, 0, -2, -1, 1, 2};
        List<List<Integer>> expected2 = Arrays.asList(Arrays.asList(-2, -1, 3), Arrays.asList(-2, 0, 2), Arrays.asList(-1, 0, 1));
        assertEquals(expected2, ThreeSumFinder.findAllThreeSumsHiLow(nums2));

        int[] nums3 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected3 = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        assertEquals(expected3, ThreeSumFinder.findAllThreeSumsHiLow(nums3));
    }

    @Test
    // Sane worst case for as above but average case is slower
    public void findThreeSumNoSort() {
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(-2, 0, 2), Arrays.asList(-1, 0, 1));
        assertEquals(expected1, ThreeSumFinder.findAllThreeSumsHiLow(nums1));

        int[] nums2 = {3, 0, -2, -1, 1, 2};
        List<List<Integer>> expected2 = Arrays.asList(Arrays.asList(-2, -1, 3), Arrays.asList(-2, 0, 2), Arrays.asList(-1, 0, 1));
        assertEquals(expected2, ThreeSumFinder.findAllThreeSumsHiLow(nums2));

        int[] nums3 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected3 = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        assertEquals(expected3, ThreeSumFinder.findAllThreeSumsHiLow(nums3));
    }
}