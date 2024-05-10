package org.mwatt.permutations;

public class Palindrome {
    public static boolean isPalinedrome(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;

        while (right > left) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
