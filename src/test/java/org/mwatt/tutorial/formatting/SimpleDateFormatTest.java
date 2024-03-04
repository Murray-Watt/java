package org.mwatt.tutorial.formatting;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleDateFormatTest {

    @Test
    public void formattingDates() {
        ZonedDateTime dateTime = ZonedDateTime.parse("2024-12-31T05:34:56-03:00[UTC-03:00]",DateTimeFormatter.ISO_ZONED_DATE_TIME);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        assertEquals("2024-12-31 05:34:56", formatter.format(dateTime));

        formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
        assertEquals("2024-12-31T05:34:56-03:00[UTC-03:00]", formatter.format(dateTime));

        formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
        assertEquals("2024-366-03:00", formatter.format(dateTime));
    }
}
