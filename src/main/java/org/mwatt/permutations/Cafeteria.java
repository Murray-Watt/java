package org.mwatt.permutations;

import java.util.Arrays;

public class Cafeteria {
    public long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {
        // Write your code here
        Arrays.sort(S);
        long result = 0;
        long start = 1, end;

        for(int i=0; i<M; ++i) {
            end = S[i] - K - 1;
            result += getCount(start, end, K);
            start = S[i] + K + 1;
        }
        result += getCount(start, N, K);
        return result;
    }

    private long getCount(long start, long end, long K) {
        return start > end ? 0 : (end - start)/(K + 1) + 1;
    }
}
