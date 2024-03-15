package org.mwatt.algorithms.strings.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AbbreviationTest {
    @Test
    public void testValidWordAbbreviation1ForValidAbbreviation() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation1("internationalization", "i18n");
        assertTrue(result);
    }

    @Test
    public void testValidWordAbbreviation1ForInvalidAbbreviation() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation1("apple", "a3e");
        assertTrue(result);
    }

    @Test
    public void testValidWordAbbreviation1ForAbbreviationA() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation1("a", "a");
         assertTrue(result);
    }

    @Test
    public void testValidWordAbbreviation1ForAbbreviation01() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation1("01", "01");
        assertFalse(result);
    }

    @Test
    public void testValidWordAbbreviation1ForInvalidAbbreviationAbc() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation1("internationalization", "abc");
        assertFalse(result);
    }

    @Test
    public void testValidWordAbbreviation1ForInvalidAbbreviationI27() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation1("internationalization", "i27");
        assertFalse(result);
    }

    @Test
    public void testValidWordAbbreviation2ForValidAbbreviation() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation2("internationalization", "i18n");
         assertTrue(result);
    }

    @Test
    public void testValidWordAbbreviation2ForInvalidAbbreviation() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation2("apple", "a3e");
        assertTrue(result);
    }

    @Test
    public void testValidWordAbbreviation2ForAbbreviationA() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation2("a", "a");
        assertTrue(result);
    }

    @Test
    public void testValidWordAbbreviation2ForAbbreviation01() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation2("01", "01");
         assertTrue(result);
    }

    @Test
    public void testValidWordAbbreviation2ForInvalidAbbreviationAbc() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation2("internationalization", "abc");
         assertFalse(result);
    }

    @Test
    public void testValidWordAbbreviation2ForInvalidAbbreviationI27() {
        Abbreviation abbreviation = new Abbreviation();
        boolean result = abbreviation.validWordAbbreviation2("internationalization", "i27");
        assertFalse(result);
    }
}
