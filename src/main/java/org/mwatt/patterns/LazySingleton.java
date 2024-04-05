package org.mwatt.patterns;

/*
    This is a lazy singleton class, not a utility class. Because it is this is a minimal example, it does not have any
    instance variables or methods. In a real-world example, you would have instance variables and methods.
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class LazySingleton {
    private static volatile LazySingleton instance;
    private static final Object syncLock = new Object();

    private LazySingleton() {
        // Exists only to defeat instantiation.
    }

    /*
     * synchronized block is used with a check inside to ensure that only one instance of singleton class is created.
     *
     * Functionally, if you skip the outer if, the code will work just fine, but it will be less efficient.
     * Given getInstance is called frequently, it is better to have the outer if to avoid the synchronized block.
     *
     */
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
