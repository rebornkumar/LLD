package cache.com.model;

import cache.com.service.EvictionPolicy;

public class LRUPolicy<K> implements EvictionPolicy<K> {
    @Override
    public K evictKey() {
        return null;
    }
}
