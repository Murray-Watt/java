package org.mwatt.core;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

@Getter
public class Range implements Iterable<Integer> {
        private final int lowIndex;
        private final int highIndex;

        public Range(int lowIndex, int highIndex) {
            this.lowIndex = lowIndex;
            this.highIndex = highIndex;
        }

        @Override
        public String toString() {
            return STR."(\{lowIndex}, \{highIndex})";
        }

        @Override
        public @NotNull Iterator<Integer> iterator() {
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

