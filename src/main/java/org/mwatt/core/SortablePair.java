

        package org.mwatt.core;

public class SortablePair implements Comparable<SortablePair> {
    public String name;
    public int score;

    @Override
    public int compareTo(SortablePair other) {
        if (this.score < other.score) {
            return -1;
        } else if (this.score > other.score) {
            return 1;
        }

        return 0;
    }
}
