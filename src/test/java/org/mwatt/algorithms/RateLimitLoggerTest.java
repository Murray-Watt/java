package org.mwatt.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateLimitLoggerTest {

    @Test
    public void testRateLimitLogger() {
        RateLimitLogger rateLimitLogger = new RateLimitLogger();
        assertTrue(rateLimitLogger.shouldPrintMessage(1, "foo"));
        assertFalse(rateLimitLogger.shouldPrintMessage(2, "foo"));
        assertTrue(rateLimitLogger.shouldPrintMessage(11, "foo"));
        assertTrue(rateLimitLogger.shouldPrintMessage(12, "foo"));
    }

}