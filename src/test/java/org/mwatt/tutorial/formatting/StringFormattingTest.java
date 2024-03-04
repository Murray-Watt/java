package org.mwatt.tutorial.formatting;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFormattingTest {

    @Test
    public void formattingString() {
        String s1 = "Hello";

        System.out.printf("s1: %s.", s1);
        System.out.println();
        assertEquals("s1: Hello.", String.format("s1: %s.", s1));

        System.out.printf("s1: %10s.", s1);
        System.out.println();
        assertEquals("s1:      Hello.", String.format("s1: %10s.", s1));

        System.out.printf("s1: %-10s.", s1);
        System.out.println();
        assertEquals("s1: Hello     .", String.format("s1: %-10s.", s1));
    }

    @Test
    public void formattingIntegers() {
        int i1 = 123;

        System.out.printf("i1: %d.", i1);
        System.out.println();
        assertEquals("i1: 123.", String.format("i1: %d.", i1));

        System.out.printf("i1: %10d.", i1);
        System.out.println();
        assertEquals("i1:        123.", String.format("i1: %10d.", i1));

        System.out.printf("i1: %-10d.", i1);
        System.out.println();
        assertEquals("i1: 123       .", String.format("i1: %-10d.", i1));

        System.out.printf("i1: %010d.", i1);
        System.out.println();
        assertEquals("i1: 0000000123.", String.format("i1: %010d.", i1));

        System.out.printf("i1: %,d.", i1);
        System.out.println();
        assertEquals("i1: 123.", String.format("i1: %,d.", i1));

        int i2  = -123456;

        System.out.printf("i2: %d.", i2);
        System.out.println();
        assertEquals("i2: -123456.", String.format("i2: %d.", i2));

        System.out.printf("i2: %10d.", i2);
        System.out.println();
        assertEquals("i2:    -123456.", String.format("i2: %10d.", i2));

        System.out.printf("i2: %-10d.", i2);
        System.out.println();
        assertEquals("i2: -123456   .", String.format("i2: %-10d.", i2));

        System.out.printf("i2: %010d.", i2);
        System.out.println();
        assertEquals("i2: -000123456.", String.format("i2: %010d.", i2));

        System.out.printf("i2: %,d.", i2);
        System.out.println();
        assertEquals("i2: -123,456.", String.format("i2: %,d.", i2));
    }

    @Test
    public void formattingFloatingPoint() {
        double d1 = 123.456;

        System.out.printf("d1: %f.", d1);
        System.out.println();
        assertEquals("d1: 123.456000.", String.format("d1: %f.", d1));

        System.out.printf("d1: %10.2f.", d1);
        System.out.println();
        assertEquals("d1:     123.46.", String.format("d1: %10.2f.", d1));

        System.out.printf("d1: %-10.2f.", d1);
        System.out.println();
        assertEquals("d1: 123.46    .", String.format("d1: %-10.2f.", d1));

        System.out.printf("d1: %010.2f.", d1);
        System.out.println();
        assertEquals("d1: 0000123.46.", String.format("d1: %010.2f.", d1));

        System.out.printf("d1: %,.2f.", d1);
        System.out.println();
        assertEquals("d1: 123.46.", String.format("d1: %,.2f.", d1));

        double d2 = -123.456;

        System.out.printf("d2: %f.", d2);
        System.out.println();
        assertEquals("d2: -123.456000.", String.format("d2: %f.", d2));

        System.out.printf("d2: %10.2f.", d2);
        System.out.println();
        assertEquals("d2:    -123.46.", String.format("d2: %10.2f.", d2));

        System.out.printf("d2: %-10.2f.", d2);
        System.out.println();
        assertEquals("d2: -123.46   .", String.format("d2: %-10.2f.", d2));

        System.out.printf("d2: %010.2f.", d2);
        System.out.println();
        assertEquals("d2: -000123.46.", String.format("d2: %010.2f.", d2));

        System.out.printf("d2: %,.2f.", d2);
        System.out.println();
        assertEquals("d2: -123.46.", String.format("d2: %,.2f.", d2));
    }

    @Test
    public void formattingDates() throws ParseException {
        boolean isDST = TimeZone.getDefault().inDaylightTime(new Date());
        String zoneCode = Calendar.getInstance().getTimeZone().getDisplayName(isDST, TimeZone.SHORT);

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse("2021-12-31");

        System.out.printf("date: %s.", date);
        System.out.println();

        assertEquals("date: Fri Dec 31 00:00:00 " + zoneCode + " 2021.", String.format("date: %s.", date));

        System.out.printf("date: %tF.", date);
        System.out.println();
        assertEquals("date: 2021-12-31.", String.format("date: %tF.", date));

        System.out.printf("date: %tD.", date);
        System.out.println();
        assertEquals("date: 12/31/21.", String.format("date: %tD.", date));

        System.out.printf("date: %tY-%tm-%td.", date, date, date);
        System.out.println();
        assertEquals("date: 2021-12-31.", String.format("date: %tY-%tm-%td.",  date, date, date));

        System.out.printf("date: %tY-%<tm-%<td.", date);
        System.out.println();
        assertEquals("date: 2021-12-31.", String.format("date: %tY-%<tm-%<td.", date));
    }

    @Test
    public void formatTime() {
        LocalTime time = LocalTime.parse("12:34:56");

        System.out.printf("time: %s.", time);
        System.out.println();
        assertEquals("time: 12:34:56.", String.format("time: %s.", time));

        System.out.printf("time: %tT.", time);
        System.out.println();
        assertEquals("time: 12:34:56.", String.format("time: %tT.", time));
    }

    @Test
    public void formatDateTime() {
        LocalDateTime dateTime = LocalDateTime.parse("2021-12-31T12:34:56");

        System.out.printf("dateTime: %s.", dateTime);
        System.out.println();
        assertEquals("dateTime: 2021-12-31T12:34:56.", String.format("dateTime: %s.", dateTime));

        System.out.printf("dateTime: %tF %tT.", dateTime, dateTime);
        System.out.println();
        assertEquals("dateTime: 2021-12-31 12:34:56.", String.format("dateTime: %tF %tT.", dateTime, dateTime));

        System.out.printf("dateTime: %tY-%tm-%td %tH:%tM:%tS.", dateTime, dateTime, dateTime, dateTime, dateTime, dateTime);
        System.out.println();
        assertEquals("dateTime: 2021-12-31 12:34:56.", String.format("dateTime: %tY-%tm-%td %tH:%tM:%tS.", dateTime, dateTime, dateTime, dateTime, dateTime, dateTime));
    }

    @Test
    public void formatDateTimeWithTimeZone() {
        ZonedDateTime dateTime = ZonedDateTime.parse("2021-12-31T12:34:56Z");

        System.out.printf("dateTime: %s.", dateTime);
        System.out.println();
        assertEquals("dateTime: 2021-12-31T12:34:56Z.", String.format("dateTime: %s.", dateTime));

        System.out.printf("dateTime: %tF %tT %tZ.", dateTime, dateTime, dateTime);
        System.out.println();
        assertEquals("dateTime: 2021-12-31 12:34:56 Z.", String.format("dateTime: %tF %tT %tZ.", dateTime, dateTime, dateTime));

        System.out.printf("dateTime: %tY-%tm-%td %tH:%tM:%tS %tZ.", dateTime, dateTime, dateTime, dateTime, dateTime, dateTime, dateTime);
        System.out.println();
        assertEquals("dateTime: 2021-12-31 12:34:56 Z.", String.format("dateTime: %tY-%tm-%td %tH:%tM:%tS %tZ.", dateTime, dateTime, dateTime, dateTime, dateTime, dateTime, dateTime));
    }

    @Test
    public void formatToUpperCase() {
        String s1 = "Hello";

        System.out.printf("s1: %S.", s1);
        System.out.println();
        assertEquals("s1: HELLO.", String.format("s1: %S.", s1));
    }
}
