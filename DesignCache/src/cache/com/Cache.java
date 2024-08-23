package cache.com;

import cache.com.service.EvictionPolicy;
import cache.com.service.Storage;

public class Cache<K,V> {
    private Storage<K,V> storage;
    private EvictionPolicy<K> evictionPolicy;

    public Cache(Storage storage, EvictionPolicy evictionPolicy) {
        this.storage = storage;
        this.evictionPolicy = evictionPolicy;
    }
    public V get(K key) {
        return storage.get(key);
    }
    public void put(K key, V value) {
        storage.put(key,value);
    }
}
