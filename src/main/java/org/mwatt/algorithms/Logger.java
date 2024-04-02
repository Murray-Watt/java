package org.mwatt.algorithms;

import java.util.HashMap;
import java.util.Map;

class Logger {

    Map<String,Integer> lastLogged = new HashMap<>();

    public Logger() {

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

