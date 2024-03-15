package org.mwatt.algorithms.search.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTwoSumTest {

    @Test
    public void findTwoSums() {
        FindTwoSum findTwoSums = new FindTwoSum();
        assertArrayEquals(new int[]{0,1}, findTwoSums.findTwoSum(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1,2}, findTwoSums.findTwoSum(new int[]{3,2,4}, 6));
        assertArrayEquals(new int[]{0,1}, findTwoSums.findTwoSum(new int[]{3,3}, 6));
    }
}