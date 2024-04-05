package org.mwatt.algorithms;

import java.util.HashMap;
import java.util.Map;

class RateLimitLogger {

    Map<String,Integer> lastLogged = new HashMap<>();

    public RateLimitLogger() {

    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (lastLogged.containsKey(message)) {
            if (lastLogged.get(message) + 10 > timestamp) {
                return false;
            }
        }

        lastLogged.put(message,timestamp);
        return true;
    }
}

