package org.mwatt.algorithms.dynamic.easy;

public class MinCostPath {

    // Recursive implementation to choose the minimum cost path
    private int chooseMinPathRecursiveStep(int[] cost,
                                           int currentStep,
                                           int targetStep,
                                           int costSoFar) {
        int stepsRemaining = targetStep - currentStep;

        // Base case: if no steps remaining, return the current cost
        if (stepsRemaining == 0) {
            return costSoFar;
        }

        // Calculate the new cost by adding the current step's cost
        int newCost = costSoFar + cost[currentStep];

        // Base case: if only one step remaining, return the new cost
        if (stepsRemaining == 1) {
            return newCost;
        }

        // Choose the minimum cost path by considering one-step and two-step options
        int oneStepCost = chooseMinPathRecursiveStep(cost, currentStep + 1, targetStep, newCost);
        int twoStepCost = chooseMinPathRecursiveStep(cost, currentStep + 2, targetStep, newCost);

        return Math.min(oneStepCost, twoStepCost);
    }

    // Recursive method to find the minimum cost starting from either step 0 or step 1
    public int minCostRecursive(int[] cost) {
        int start0 = chooseMinPathRecursiveStep(cost, 0, cost.length, 0);
        int start1 = chooseMinPathRecursiveStep(cost, 1, cost.length, 0);

        return Math.min(start0, start1);
    }

    // Dynamic programming implementation of finding the minimum cost path
    public int minCostDynamicProgramming(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }

    // Space-optimized dynamic programming implementation of finding the minimum cost path
    public int minCostDynamicProgrammingOptimized(int[] cost) {
        int previous2 = cost[0];
        int previous1 = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int current = cost[i] + Math.min(previous1, previous2);
            previous2 = previous1;
            previous1 = current;
        }
        return Math.min(previous1, previous2);
    }
}