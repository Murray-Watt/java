package org.mwatt.tutorial.classes;

public interface Profession {
    int MAX_LEVEL = 100;

    ProfessionType getProfessionType();
    long getExperience();
    void addExperience(long experience);
    void currentLevel();

    boolean canAdvance();
    void advance();

    // Allowed in Java 7
    static String getName(Profession profession) {
        return profession.getProfessionType().getName();
    }

    // Allowed in Java 8
    default String getName() {
        return getProfessionType().getName();
    }
}
