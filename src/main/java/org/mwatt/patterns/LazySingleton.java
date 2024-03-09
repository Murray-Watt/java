package org.mwatt.patterns;

public class LazySingleton {
    private static volatile LazySingleton instance;
    private static final Object syncLock = new Object();


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
