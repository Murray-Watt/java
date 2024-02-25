package org.mwatt.tutorial.classes;

import java.util.Iterator;

public interface InitializedCache<K, V> {
    void initialize(Iterator<Pair<K, V>> iterator);
}
