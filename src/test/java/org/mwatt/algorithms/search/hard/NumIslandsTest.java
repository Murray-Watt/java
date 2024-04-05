package org.mwatt.algorithms.search.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumIslandsTest {
    @Test
    void testNumIslands() {
        NumIslands numIslands = new NumIslands();
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        assertEquals(1, numIslands.numIslands(grid));

        grid = new char[][] {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        assertEquals(3, numIslands.numIslands(grid));
    }
}