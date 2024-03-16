package org.mwatt.algorithms.dynamic.easy;

import org.junit.Test;
import org.mwatt.algorithms.dynamic.easy.FindThreeSum;

import static org.junit.jupiter.api.Assertions.*;

public class FindThreeSumTest {
    @Test
    public void findThreeSums() {
        FindThreeSum findThreeSums = new FindThreeSum();
        assertArrayEquals(new int[]{0,1,2}, findThreeSums.findThreeSum(new int[]{2,7,11,15}, 20));
        assertArrayEquals(new int[]{0,1,3}, findThreeSums.findThreeSum(new int[]{2,7,11,15}, 24));
        assertArrayEquals(new int[]{0,1,2}, findThreeSums.findThreeSum(new int[]{3,2,4}, 9));
        assertArrayEquals(new int[]{0,1,2}, findThreeSums.findThreeSum(new int[]{3,3,3}, 9));
    }
}