package org.mwatt.tutorial.flow;

import org.junit.jupiter.api.Test;

public class ForEachLoop {
    @Test
    public void basicForEachLoop() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of numbers is: " + sum);
    }

    @Test
    public void nestedForEachLoop() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int[] row : numbers) {
            for (int number : row) {
                sum += number;
            }
        }

        System.out.println("Sum of numbers is: " + sum);
    }

    @Test
    public void forEachLoopBreak() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            if (sum > 10) {
                break;
            }
        }

        System.out.println("Sum of numbers is: " + sum);
    }

    @Test
    public void forEachLoopContinue() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                continue;
            }
            sum += number;
        }

        System.out.println("Sum of numbers is: " + sum);
    }

    @Test
    public void forEachLoopWithLabel() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        outer:
        for (int[] row : numbers) {
            for (int number : row) {
                sum += number;
                if (sum > 10) {
                    break outer;
                }
            }
        }

        System.out.println("Sum of numbers is: " + sum);
    }
}
