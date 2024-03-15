package org.mwatt.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchBracketsTest {

    @Test
    public void matchBracketsStringBuilder() {
        MatchBrackets matchBrackets = new MatchBrackets();
        assertTrue(matchBrackets.isValidStringBuilder("()"));
        assertTrue(matchBrackets.isValidStringBuilder("()[]{}"));
        assertFalse(matchBrackets.isValidStringBuilder("(]"));
        assertFalse(matchBrackets.isValidStringBuilder("([)]"));
        assertTrue(matchBrackets.isValidStringBuilder("{[]}"));
    }

    @Test
    public void matchBracketsStack() {
        MatchBrackets matchBrackets = new MatchBrackets();
        assertTrue(matchBrackets.isValidTimeOptimized("()"));
        assertTrue(matchBrackets.isValidTimeOptimized("()[]{}"));
        assertFalse(matchBrackets.isValidTimeOptimized("(]"));
        assertFalse(matchBrackets.isValidTimeOptimized("([)]"));
        assertTrue(matchBrackets.isValidTimeOptimized("{[]}"));
    }

    @Test
    public void matchBracketsIfs() {
        MatchBrackets matchBrackets = new MatchBrackets();
        assertTrue(matchBrackets.isValidNoMap("()"));
        assertTrue(matchBrackets.isValidNoMap("()[]{}"));
        assertFalse(matchBrackets.isValidNoMap("(]"));
        assertFalse(matchBrackets.isValidNoMap("([)]"));
        assertTrue(matchBrackets.isValidNoMap("{[]}"));
    }

    @Test
    public void matchBracketsMapped() {
        MatchBrackets matchBrackets = new MatchBrackets();
        assertTrue(matchBrackets.isValid("()"));
        assertTrue(matchBrackets.isValid("()[]{}"));
        assertFalse(matchBrackets.isValid("(]"));
        assertFalse(matchBrackets.isValid("([)]"));
        assertTrue(matchBrackets.isValid("{[]}"));
    }

    @Test
    public void matchBracketsMappedWithDeque() {
        MatchBrackets matchBrackets = new MatchBrackets();
        assertTrue(matchBrackets.isValid2("()"));
        assertTrue(matchBrackets.isValid2("()[]{}"));
        assertFalse(matchBrackets.isValid2("(]"));
        assertFalse(matchBrackets.isValid2("([)]"));
        assertTrue(matchBrackets.isValid2("{[]}"));
    }
}