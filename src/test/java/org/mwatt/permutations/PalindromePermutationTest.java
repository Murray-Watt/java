package org.mwatt.permutations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {
    @Test
    void hasPalindromePermutation() {
        assertTrue(PalindromePermutation.hasPalindromePermutation("aab"));
        assertTrue(PalindromePermutation.hasPalindromePermutation("aabb"));
        assertTrue(PalindromePermutation.hasPalindromePermutation("aabbb"));
        assertFalse(PalindromePermutation.hasPalindromePermutation("abc"));
        assertTrue(PalindromePermutation.hasPalindromePermutation(""));
        assertTrue(PalindromePermutation.hasPalindromePermutation(null));
        assertTrue(PalindromePermutation.hasPalindromePermutation("a"));
        assertTrue(PalindromePermutation.hasPalindromePermutation("a\tb\ta"));
        assertTrue(PalindromePermutation.hasPalindromePermutation("a\nb\na"));
    }
}