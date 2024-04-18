package org.mwatt.algorithms.strings.easy;

import java.util.*;
import java.util.stream.Collectors;

public class RomanNumerals {
    private static final Map<Character,Integer> symbolToValue = new HashMap<>(){
        {
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }
    };

    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int total = 0;

        int length = s.length();
        int prevSymValue = 1000;
        int nextChar = 0;

        while (nextChar < length) {
            int newSymValue = symbolToValue.get(s.charAt(nextChar));

            if (prevSymValue < newSymValue) {
                total += (-2 * prevSymValue) + newSymValue;
            } else {
                total += newSymValue;
            }

            prevSymValue = newSymValue;
            nextChar++;
        }

        return total;
    }

    private static final Map<Integer,String> valueToSymbol = new HashMap<>(){
        {
            put(1000,"M");
            put(500,"D");
            put(100,"C");
            put(50,"L");
            put(10,"X");
            put(5,"V");
            put(1,"I");
        }
    };

    List<Integer> keys = valueToSymbol.keySet().stream().sorted().collect(Collectors.toList()).reversed();
    List<Integer> halfKeys = Arrays.asList(500, 50, 5);

    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        for (int i=0; i < keys.size(); i++) {
            int key = keys.get(i);

            if (key <= num && !halfKeys.contains(key)) {
                int digit = num / key;
                num = num % key;

                if (digit == 9) {
                    int key10 = key * 10;
                    if (keys.contains(key10)) {
                        roman.append(valueToSymbol.get(key));
                        roman.append(valueToSymbol.get(key10));
                    }
                } else if (digit >  5) {
                    int key5 = key * 5;
                    if (keys.contains(key5)) {
                        roman.append(valueToSymbol.get(key5));
                        roman.append(valueToSymbol.get(key).repeat(digit-5));
                    }
                } else if (digit ==  5) {
                    int key5 = key * 5;
                    if (keys.contains(key5)) {
                        roman.append(valueToSymbol.get(key5));
                    }
                } else if (digit == 4) {
                    int key5 = key * 5;
                    if (keys.contains(key5)) {
                        roman.append(valueToSymbol.get(key));
                        roman.append(valueToSymbol.get(key5));
                    }
                } else if (digit < 4) {
                    roman.append(valueToSymbol.get(key).repeat(digit));
                } else {
                    System.out.println("digit: " + digit + " should not occur");
                }
            }
        }


        return roman.toString();
    }
}
