package org.mwatt.core;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {
        private final int lowIndex;
        private final int highIndex;

        public Range(int lowIndex, int highIndex) {
            this.lowIndex = lowIndex;
            this.highIndex = highIndex;
        }

        public int getLowIndex() {
            return lowIndex;
        }

        public int getHighIndex() {
            return highIndex;
        }

        // Optional: Override toString() for a readable representation of the range
        @Override
        public String toString() {
            return "(" + lowIndex + ", " + highIndex + ")";
        }

        @Override
        public Iterator<Integer> iterator() {
            return new RangeIterator();
        }

        private class RangeIterator implements Iterator<Integer> {
            private int currentIndex = lowIndex;

            @Override
            public boolean hasNext() {
                return currentIndex <= highIndex;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return currentIndex++;
            }
        }
}

