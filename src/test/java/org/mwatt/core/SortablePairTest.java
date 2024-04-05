package org.mwatt.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortablePairTest {

    @Test
    public void compareTo() {
        SortablePair pair1 = new SortablePair();
        pair1.score = 1;
        SortablePair pair2 = new SortablePair();
        pair2.score = 2;
        SortablePair pair3 = new SortablePair();
        pair3.score = 1;

        assertTrue(pair1.compareTo(pair2) < 0);
        assertTrue(pair2.compareTo(pair1) > 0);
        //noinspection SimplifiableAssertion
        assertTrue(pair1.compareTo(pair3) == 0);
    }

}