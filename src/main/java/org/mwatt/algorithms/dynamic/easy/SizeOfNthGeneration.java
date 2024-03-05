package org.mwatt.algorithms.dynamic.easy;

/*
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps.
    In how many distinct ways can you climb to the top?

    Constraint 1 <= n <= 45
 */
public class SizeOfNthGeneration {
    // Brute force solution
    public int sizeOfNthGenerationRecursive(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return sizeOfNthGenerationRecursive(n - 1) + sizeOfNthGenerationRecursive(n-2);
        }
    }

    public int sizeOfNthGenerationDynamicProgramming(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int[] dp = new int[n];
            dp[0] = 1;
            dp[1] = 2;
            for (int i = 2; i < n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp[n-1];
        }
    }

    public int sizeOfNthGeneration(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int previous2 = 1;
            int previous = 2;
            int fib = 0;
            for (int i = 2; i < n; i++) {
                fib = previous2 + previous;
                previous2 = previous;
                previous = fib;
            }
            return fib;
        }
    }
}
