package org.mwatt.algorithms.search.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAddendsTest {

    @Test
    public void findAddends() {
        FindAddends findAddends = new FindAddends();
        assertArrayEquals(new int[]{0,1}, findAddends.findAddends(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1,2}, findAddends.findAddends(new int[]{3,2,4}, 6));
        assertArrayEquals(new int[]{0,1}, findAddends.findAddends(new int[]{3,3}, 6));
    }
}