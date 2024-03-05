package org.mwatt.algorithms.dynamic.easy;

public class Fibonacci {

    public int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public int fibonacciDynamicProgramming(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    public int fibDynamicProgrammingSpaceOptimized(int n) {
        if (n <= 1) {
            return n;
        }

        int previous = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int newCurrent = previous + current;
            previous = current;
            current = newCurrent;
        }

        return current;
    }
}
