package org.mwatt.algorithms.strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("abba"));
        assertTrue(Palindrome.isPalindrome("abcba"));
        assertTrue(Palindrome.isPalindrome("abbbba"));
        assertFalse(Palindrome.isPalindrome("hello"));
        assertTrue(Palindrome.isPalindrome(""));
        assertTrue(Palindrome.isPalindrome(null));
        assertTrue(Palindrome.isPalindrome("a"));
        assertTrue(Palindrome.isPalindrome("a\tb\ta"));
        assertTrue(Palindrome.isPalindrome("a\nb\na"));
    }
}
