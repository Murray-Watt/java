package org.mwatt.algorithms.dynamic.easy;

import java.util.Deque;
import java.util.LinkedList;

public class ExcelSheetColumnTitle {
    public static final int A_OFFSET = 'A';
    public static final int NUM_LETTERS = 26;

    private char letterIndexToChar(int letterIndex) {
        return (char) (A_OFFSET+letterIndex);
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder titleSoFar = new StringBuilder();

        Deque<Integer> digits = new LinkedList<>();

        do {
            columnNumber = columnNumber - 1;
            int remainder = columnNumber % NUM_LETTERS;
            digits.push(remainder);
            columnNumber = columnNumber / NUM_LETTERS;
        } while (columnNumber > 0);

        while (!digits.isEmpty()) {
            int x = digits.pop();
            titleSoFar.append(letterIndexToChar(x));
        }


        return titleSoFar.toString();
    }
}
