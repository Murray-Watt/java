package org.mwatt.algorithms.search.hard;

import java.util.LinkedList;
import java.util.Queue;

class NumIslands {
    private final int[][] neighbors = {{0,-1},{0,1},{-1,0},{1,0}};

    public void markVisitedBfs(char[][] grid, int r, int c, int nRows, int nCols) {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r,c});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int[] neighbor : neighbors) {
                int newR = current[0] + neighbor[0];
                int newC = current[1] + neighbor[1];

                if (0 <= newR && newR < nRows && 0 <= newC && newC < nCols && 
                    grid[newR][newC] == '1') {
                    grid[newR][newC] = '0';
                    queue.offer(new int[]{newR,newC}); 
                }
            }
        }

    }

    public int numIslands(char[][] grid) {
        int islandCount = 0;
        int nRows = grid.length;
        int nCols = grid[0].length;
        
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                char current = grid[i][j];

                if (current == '1') {
                    islandCount++;
                    markVisitedBfs(grid,i,j, nRows, nCols);
                }
            }
        }

        return islandCount;
    }
}