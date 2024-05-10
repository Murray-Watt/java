package org.mwatt.algorithms.arrays;

// [[110,5,112,113,114],[210,211,5,213,214],[310,311,3,313,314],[410,411,412,5,414],[5,1,512,3,3],[610,4,1,613,614],[710,1,2,713,714],[810,1,2,1,1],[1,1,2,2,2],[4,1,4,4,1014]]
// [[1,3,5,5,2],[3,4,3,3,1],[3,2,4,5,2],[2,4,4,5,5],[1,4,4,1,1]]

public class CandyCrush {
    int rows = 0;
    int cols = 0;
    int[][] gboard;
    int[][] temp;

    public boolean find(int r, int c) {
        boolean stable = true;

        int candy = gboard[r][c];


        if (c < cols - 2 && gboard[r][c+1]== candy && gboard[r][c+2] == candy) {
            int i = c;
            stable = false;

            while (i < cols && gboard[r][i] == candy) {
                temp[r][i] = candy;
                i++;
            }
        }

        if (r < rows - 2 && gboard[r+1][c]== candy && gboard[r+2][c] == candy) {
            int i = r;
            stable = false;

            while (i < rows && gboard[i][c] == candy) {
                temp[i][c] = candy;
                i++;
            }
        }

        return stable;
    }

    public int[][] candyCrush(int[][] board) {
        boolean stable = false;
        rows = board.length;
        cols = board[0].length;

        gboard = board;
        temp = new int[rows][cols];

        while(!stable) {
            stable = true;
            for (int i=0; i < rows; i++) {
                for (int j=0; j < cols; j++) {
                    temp[i][j] = 0;
                }
            }

            // find
            for (int i=0; i < rows; i++) {
                for (int j=0; j < cols; j++) {
                    if (board[i][j] != 0) {
                        stable &= find(i,j);
                    }
                }
            }

            if (stable) {
                break;
            }

            // crush
            for (int i=0; i < rows; i++) {
                for (int j=0; j < cols; j++) {
                    if (temp[i][j] != 0) {
                        board[i][j] = 0;
                    }
                }
            }

            // drop
            for (int j=0; j < cols; j++) {
                for (int r = rows-1; r >= 0; r--) {
                    if (board[r][j] == 0) {
                        int fast = r-1;
                        while (fast >= 0 && board[fast][j] == 0) {
                            fast--;
                        }

                        if (fast < 0) break;

                        board[r][j] = board[fast][j];
                        board[fast][j] = 0;
                    }
                }
            }
        }

        return board;
    }
}
