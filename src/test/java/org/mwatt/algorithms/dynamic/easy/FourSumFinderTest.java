package org.mwatt.algorithms.dynamic.easy;

import org.junit.jupiter.api.Test;
import org.mwatt.algorithms.dynamic.medium.FourSumFinder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FourSumFinderTest {

    @Test
    public void fourSumEmptyArray() {
        int[] nums = {};
        assertEquals(Collections.emptyList(), FourSumFinder.fourSum(nums));
    }

    @Test
    public void fourSumNoSolution() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(Collections.emptyList(), FourSumFinder.fourSum(nums));
    }

    @Test
    public void fourSumOneSolution() {
        int[] nums = {0, 1, 2, -3};
        List<List<Integer>> expected = List.of(Arrays.asList(-3, 0, 1, 2));
        assertEquals(expected, FourSumFinder.fourSum(nums));
    }

    @Test
    public void fourSumFiveElementsOneSolution() {
        int[] nums = {-3, -2, -1, 1, 3};
        List<List<Integer>> expected = List.of(Arrays.asList(-3, -1, 1, 3));
        assertEquals(expected, FourSumFinder.fourSum(nums));
    }

    @Test
    public void fourSumHas_Neg3_0_0_3() {
        int[] nums = {1, 0, -8, 0, -7, 2, -3, 3};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-3, 0, 1, 2),
                Arrays.asList(-3, 0, 0, 3)
        );

        assertEquals(expected, FourSumFinder.fourSum(nums));
    }

    @Test
    public void fourSumEachAddentIsNotRepeated() {
        int[] nums = {-2, 0, 0, 1, 2};
        List<List<Integer>> expected = List.of(
                Arrays.asList(-2, 0, 0, 2)
        );

        assertEquals(expected, FourSumFinder.fourSum(nums));
    }


    @Test
    public void fourSumTestOneSolutionWithOneElementZero() {
        int[] nums= {-3, 0, 1, 2};
        List<List<Integer>> expected2_test3 = List.of(
                Arrays.asList(-3, 0, 1, 2)
        );
        assertEquals(expected2_test3, FourSumFinder.fourSum(nums));
    }

    @Test
    public void fourSumTestOneSolutionManyNums() {
        int[] nums2_test4 = {-1000, 0, 1, 2, -1000, -1000, -3, -1000};
        List<List<Integer>> expected2_test4 = List.of(
                Arrays.asList(-3, 0, 1, 2)
        );
        assertEquals(expected2_test4, FourSumFinder.fourSum(nums2_test4));
    }


    @Test
    public void fourSum() {
        int[] nums1 = {1, 0, -1, 0, -2, 2, -3, 3};
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(-3, -2, 2, 3),
                Arrays.asList(-3, -1, 1, 3),
                Arrays.asList(-3, 0, 1, 2),
                Arrays.asList(-3, 0, 0, 3),
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2, -1, 0, 3),
                Arrays.asList(-2, 0, 0, 2),
                Arrays.asList(-1, 0, 0, 1)
        );
        assertEquals(expected1, FourSumFinder.fourSum(nums1));

        int[] nums2 = {3, 0, -2, -1, 1, 2, -3, -4};
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(-4, -1, 2, 3),
                Arrays.asList(-4, 0, 1, 3),
                Arrays.asList(-3, -2, 2, 3),
                Arrays.asList(-3, -1, 1, 3),
                Arrays.asList(-3, 0, 1, 2),
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2, -1, 0, 3)
        );
        assertEquals(expected2, FourSumFinder.fourSum(nums2));
    }


    @Test
    public void fourSumLotsOfCombos() {

        int[] nums = {-1, 0, 1, 2, -1, -4, 3, -3};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-4, -1, 2, 3),
                Arrays.asList(-4, 0, 1, 3),
                Arrays.asList(-3, -1, 1, 3),
                Arrays.asList(-3, 0, 1, 2),
                Arrays.asList(-1, -1, 0, 2)
        );

        assertEquals(expected, FourSumFinder.fourSum(nums));
    }
}
