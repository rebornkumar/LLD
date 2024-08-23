package cache.com.service;

public interface Storage<K,V> {
    void put(K key, V value);
    V get(K key);
}
