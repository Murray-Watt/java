package org.mwatt.permutations;

public class PalindromePermutation {
    
    public static boolean hasPalindromePermutation(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        int[] charCounts = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }

        // Check if there is more than one odd count
        boolean foundOdd = false;
        for (int count : charCounts) {
            if (count % 2 != 0) {
                if (foundOdd) {
                    return false; // More than one odd count
                }
                foundOdd = true;
            }
        }

        return true;
    }
}
