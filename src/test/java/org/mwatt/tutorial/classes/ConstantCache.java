package org.mwatt.tutorial.classes;

import java.util.Iterator;

public class ConstantCache<K,V> implements ImmutableCache<K,V>, InitializedCache<K,V> {

    protected ConstantCache() {

    }
    public static <TKey,TValue> ConstantCache<TKey,TValue> createCache(Iterator<Pair<TKey,TValue>> iterator) {
        ConstantCache<TKey,TValue> instance = new ConstantCache<TKey,TValue>();
        instance.initialize(iterator);
        return instance;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void put(K key, V value) {

    }

    @Override
    public void remove(K key) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public void initialize(Iterator<Pair<K, V>> iterator) {

    }
}
