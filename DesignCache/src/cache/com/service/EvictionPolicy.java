package cache.com.service;

public interface EvictionPolicy<K> {
     K evictKey();
}
