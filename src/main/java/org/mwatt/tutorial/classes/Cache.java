package org.mwatt.tutorial.classes;

public interface Cache<K, V> extends ImmutableCache<K, V> {
    void put(K key, V value);
    void remove(K key);
    void clear();
}
