package org.mwatt.tutorial.classes;

public interface ImmutableCache<K, V> {
    V get(K key);
    void put(K key, V value);
    void remove(K key);
    void clear();
    int size();
    boolean isEmpty();
    boolean containsKey(K key);
    boolean containsValue(V value);
}



