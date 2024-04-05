package org.mwatt.algorithms;

public class PairsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainderCounts = new int[60];
        int count = 0;

        for (int t : time) {
            if (t % 60 == 0) {
                count += remainderCounts[0];
            } else {
                count += remainderCounts[60 - t % 60];
            }

            remainderCounts[t % 60]++;
        }

        return count;
    }
}
