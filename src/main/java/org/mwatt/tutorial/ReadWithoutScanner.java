package org.mwatt.tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWithoutScanner {
    public static class Example {
        public static void main(String[] args) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                int result = 0;
                String line;

                while ((line = reader.readLine()) != null) {
                    try {
                        int num = Integer.parseInt(line);
                        result += num;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Invalid input. Please enter an integer.");
                        return;
                    }
                }

                System.out.println("Sum: " + result);
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
