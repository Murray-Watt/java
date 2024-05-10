package org.mwatt.algorithms.strings;

public class DirectorOfPhotography {
    public int getArtisticPhotographCount(int N, String C, int X, int Y) {
        // Write your code here

        char[] chars = C.toCharArray();
        int total = 0;
        for (int i=0; i < N; i++) {
            for (int j=0; j < N; j++) {
                for (int k=0; k < N; k++) {
                    if (chars[j] == 'A' && chars[i]=='P' && chars[k]=='B') {
                        int d1 = i-j;
                        int d2 = j-k;

                        if (d1 * d2 > 0) {
                            int d1a = Math.abs(d1);
                            int d2a = Math.abs(d2);

                            if ((d1a >= X && d1a <= Y) && (d2a >= X && d2a <= Y)) {
                                total++;
                            }
                        }
                    }
                }
            }
        }

        return total;
    }
}
