package org.mwatt.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringTest {

    @Test
    public void testLengthOfLongestSubstring1() {
        String s = "abcabcbb";
        int expected = 3;
        int actual = LongestSubstring.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testLengthOfLongestSubstring2() {
        String s = "bbbbb";
        int expected = 1;
        int actual = LongestSubstring.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testLengthOfLongestSubstring3() {
        String s = "pwwkew";
        int expected = 3;
        int actual = LongestSubstring.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }
}
