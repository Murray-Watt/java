package org.mwatt.algorithms.dynamic.easy;

/*
 calculate the number of distinct ways to climb a staircase where you can take
 either 1 or 2 steps at a time.

 This is a classic problem that can be solved using dynamic programming or recursion.

 When you start climbing the staircase, you have two choices: you can either take
 a single step and then count the number of ways to climb the remaining (n-1) steps,
 or you can take two steps and then count the number of ways to climb the remaining (n-2) steps.

 Therefore, the total number of ways to climb the staircase of n steps is the sum of
 the number of ways to climb (n-1) steps and the number of ways to climb (n-2) steps,
 which is exactly the recurrence relation for the Fibonacci sequence.

 This is why the problem of counting the number of ways to climb a staircase with 1 or 2
 steps at a time is equivalent to finding the (n+1)th Fibonacci number.
 */
public class StaircaseClimbing {
    // Brute force solution
    // Intuitive recursive implementation
    public int waysToClimbRecursive(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return waysToClimbRecursive(n - 1) + waysToClimbRecursive(n-2);
        }
    }

    // Dynamic programming implementation
    //
    // This approach uses an array to store intermediate results,
    // reducing redundant calculations and stack space and thus improving the time complexity.
    public int waysToClimbDynamicProgramming(int n) {
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

    // Space-optimized dynamic programming implementation of the Fibonacci sequence
    // This approach reduces the space complexity by only storing the two most recent values.
    public int waysToClimbSpaceOptimized(int n) {
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
