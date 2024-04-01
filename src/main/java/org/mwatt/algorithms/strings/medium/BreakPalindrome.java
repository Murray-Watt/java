package org.mwatt.algorithms.strings.medium;

/*
    Topics:
        Different ways to increment a character in Java.
        Handling edge cases for breaking palindromes efficiently.
        Converting strings to character arrays and vice versa in Java.


    Incrementing a character and handling the wrap-around case:

        char newLetter = (char)((int)current + 1);

    Replacing a character in a string using a character array:

        char[] chars = palindrome.toCharArray();
        chars[i] = 'a';
        return String.valueOf(chars);

    Checking if a string is a palindrome and breaking it efficiently:

        int firstNonAIndex = -1;
        for (int i = 0; i < n / 2; i++) {
            if (palindrome.charAt(i) != 'a' || palindrome.charAt(n - 1 - i) != 'a') {
                firstNonAIndex = i;
                break;
            }
        }

 */
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
