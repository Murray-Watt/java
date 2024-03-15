package org.mwatt.algorithms.strings;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        String s = str.replaceAll("[^\\x00-\\x7F]", ""); // Filter out non-ASCII characters

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
