package org.mwatt.algorithms.string.medium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomSortStringTest {

    @Test
    public void testCustomSortString() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("cbad", customSortString.customSortString("cba", "abcd"));
    }

    @Test
    public void testCustomSortStringEmptyOrder() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("abcd", customSortString.customSortString("", "abcd"));
    }

    @Test
    public void testCustomSortStringEmptyString() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("", customSortString.customSortString("cba", ""));
    }

    @Test
    public void testCustomSortStringSameOrder() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("abcd", customSortString.customSortString("abcd", "abcd"));
    }

    @Test
    public void testCustomSortStringCondensed() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("cbad", customSortString.customSortStringCondensed("cba", "abcd"));
    }

    @Test
    public void testCustomSortStringCondensedEmptyOrder() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("abcd", customSortString.customSortStringCondensed("", "abcd"));
    }

    @Test
    public void testCustomSortStringCondensedEmptyString() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("", customSortString.customSortStringCondensed("cba", ""));
    }

    @Test
    public void testCustomSortStringCondensedSameOrder() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("abcd", customSortString.customSortStringCondensed("abcd", "abcd"));
    }

    @Test
    public void testCustomSortOptimizedString() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("cbad", customSortString.customSortStringOptimized("cba", "abcd"));
    }

    @Test
    public void testCustomSortStringOptimizedEmptyOrder() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("abcd", customSortString.customSortStringOptimized("", "abcd"));
    }

    @Test
    public void testCustomSortStringOptimizedEmptyString() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("", customSortString.customSortStringOptimized("cba", ""));
    }

    @Test
    public void testCustomSortStringOptimizedSameOrder() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals("abcd", customSortString.customSortStringOptimized("abcd", "abcd"));
    }
}
