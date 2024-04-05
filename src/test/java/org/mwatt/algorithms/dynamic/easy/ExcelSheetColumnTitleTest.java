package org.mwatt.algorithms.dynamic.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleTest {
    @Test
    public void testConvertToTitle() {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        assertEquals("A", excelSheetColumnTitle.convertToTitle(1));
        assertEquals("AB", excelSheetColumnTitle.convertToTitle(28));
        assertEquals("ZY", excelSheetColumnTitle.convertToTitle(701));
        assertEquals("FXSHRXW", excelSheetColumnTitle.convertToTitle(2147483647));
    }

}