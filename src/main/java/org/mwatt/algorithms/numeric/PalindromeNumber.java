package org.mwatt.algorithms.numeric;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Convert integer to string
        String str = String.valueOf(x);

        int left = 0;
        int right = str.length() - 1;

        // Check if the number is a palindrome
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
