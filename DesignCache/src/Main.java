import cache.com.Cache;
import cache.com.model.HashMapStorage;
import cache.com.model.LRUPolicy;
import cache.com.service.EvictionPolicy;
import cache.com.service.Storage;

import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Storage<Integer,Integer>storage = new HashMapStorage<>();
        EvictionPolicy<Integer>evictionPolicy = new LRUPolicy<>();
        Cache<Integer,Integer>cache = new Cache<>(storage,evictionPolicy);
        cache.put(1,1);
        cache.put(2,2);
        cache.get(2);
        cache.get(3);
    }
}