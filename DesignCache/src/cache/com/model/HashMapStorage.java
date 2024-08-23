package cache.com.model;

import cache.com.service.Storage;

public class HashMapStorage<K,V> implements Storage<K,V> {
    @Override
    public void put(K key, V value) {

    }

    @Override
    public V get(K key) {
        return null;
    }
}
