package org.mwatt.algorithms.dynamic.easy;

public class MinCostPath {
    private int chooseMinPath(int[] cost, int currentStep, int targetStep, int costSoFar) {

        int stepsRemaining = targetStep - currentStep;

        if (stepsRemaining == 0) {
            return costSoFar;
        }

        int newCost = costSoFar + cost[currentStep];

        if (stepsRemaining == 1) {
            return newCost;
        }

        int oneStepCost = chooseMinPath(cost,currentStep+1,targetStep,newCost);
        int twoStepCost = chooseMinPath(cost,currentStep+2,targetStep,newCost);

        return Math.min(oneStepCost,twoStepCost);
    }

    public int minCostRecursive(int[] cost) {
        int start0 = chooseMinPath(cost,0,cost.length,0);
        int start1 = chooseMinPath(cost,1,cost.length,0);

        return Math.min(start0,start1);
    }

    public int minCostDynamicProgramming(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }

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
