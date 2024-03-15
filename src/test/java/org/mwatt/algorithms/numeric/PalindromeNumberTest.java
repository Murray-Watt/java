package org.mwatt.algorithms.numeric;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PalindromeNumberTest {
    @Test
    public void checksIfNumberIsAPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(121));
        assertTrue(palindromeNumber.isPalindrome(1221));
        assertTrue(palindromeNumber.isPalindrome(12321));
        assertFalse(palindromeNumber.isPalindrome(-121)); // Negative number
        assertFalse(palindromeNumber.isPalindrome(10)); // Not a palindrome
    }

    @Test
    public void handlesSingleDigitNumbers() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(0));
        assertTrue(palindromeNumber.isPalindrome(5));
        assertTrue(palindromeNumber.isPalindrome(9));
    }
}