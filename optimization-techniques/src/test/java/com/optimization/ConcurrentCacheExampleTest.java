package com.optimization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentCacheExampleTest {

    @Test
    void testCompute() {
        ConcurrentCacheExample cache = new ConcurrentCacheExample();
        int key = 5;
        int expected = key * key;
        assertEquals(expected, cache.compute(key));
    }

    @Test
    void testComputeConcurrently() throws InterruptedException {
        ConcurrentCacheExample cache = new ConcurrentCacheExample();
        int key = 10;
        int expected = key * key;
        int threadCount = 10;
        CountDownLatch latch = new CountDownLatch(threadCount);
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        for (int i = 0; i < threadCount; i++) {
            executor.submit(() -> {
                assertEquals(expected, cache.compute(key));
                latch.countDown();
            });
        }

        latch.await();
        executor.shutdown();
    }
}
