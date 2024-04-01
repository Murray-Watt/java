package org.mwatt.algorithms.strings.medium;

public class BreakPalindrome {
    char smallest = 'a';
    char largest = 'z';

    public String breakPalindrome(String palindrome) {

        if (palindrome == null || palindrome.length() < 2) {
            return "";
        }

        boolean isOdd = palindrome.length() % 2 > 0;

        int limit1 = (palindrome.length() / 2) - 1;

        int limit2 = limit1 + 1;
        if (isOdd) {
            limit2++;
        }

        //System.out.println(limit1);

        for (int i = 0; i <= limit1; i++) {
            char current = palindrome.charAt(i);

            //System.out.println(current);

            if (current != smallest) {
                char[] chars = palindrome.toCharArray();
                chars[i] = 'a';
                return String.valueOf(chars);
            }
        }

        //System.out.println(limit2);

        for (int i = palindrome.length() - 1; i >= limit2; i--) {
            char current = palindrome.charAt(i);

            if (current != largest) {
                char newLetter = (char)((int)current + 1);
                System.out.println(newLetter);
                char[] chars = palindrome.toCharArray();
                chars[i] = newLetter;
                return String.valueOf(chars);
            }
        }

        return "";
    }
}
