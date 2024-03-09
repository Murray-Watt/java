package org.mwatt.patterns;

import org.jetbrains.annotations.Contract;

// This is a lazy singleton class, not a utility class
public class LazySingleton {
    private static volatile LazySingleton instance;
    private static final Object syncLock = new Object();

    @Contract(pure = true)
    private LazySingleton() {
        // Exists only to defeat instantiation.
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (syncLock) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}
