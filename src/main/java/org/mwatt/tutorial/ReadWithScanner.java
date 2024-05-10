package org.mwatt.tutorial;

import java.util.Scanner;

public class ReadWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += scanner.nextInt();
        }

        System.out.println(STR."Sum: \{result}");
    }
}
