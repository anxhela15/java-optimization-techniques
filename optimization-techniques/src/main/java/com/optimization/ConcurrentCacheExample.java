package com.optimization;

/* ConcurrentHashMap scales far better under contention than a synchronizedMap or 
* locking on a single object.
*/

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentCacheExample {
    private final ConcurrentMap<Integer,Integer> cache = new ConcurrentHashMap<>();

    // Simulates an expensive compute
    private int expensiveCompute(int key) {
        try { Thread.sleep(50); } catch (InterruptedException e) { }
        return key * key;
    }

    // Thread-safe, lock-free caching
    public int compute(int key) {
        return cache.computeIfAbsent(key, this::expensiveCompute);
    }
}
