package org.mwatt.algorithms.arrays;

public class ZigZag {
    int[] solution(int[] numbers) {
        //
        // 3 ≤ numbers.length ≤ 100,
        // 1 ≤ numbers[i] ≤ 10^9.
        //
        int[] result = new int[numbers.length-2];

        for (int i=0; i < numbers.length - 2; i++) {
            int a = numbers[i];
            int b = numbers[i+1];
            int c = numbers[i+2];

            if ((a > b && b < c) || (a < b && b > c)) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }


        return result;
    }
}
