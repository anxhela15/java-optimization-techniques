package com.optimization;

import java.util.HashMap;
import java.util.Map;

public class CachingExample {
    public int computeExpensive(int input) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return input * input;
    }

    public int sumWithoutCaching(int[] inputs) {
        int sum = 0;
        for (int input : inputs) {
            sum += computeExpensive(input);
        }
        return sum;
    }

    public int sumWithCaching(int[] inputs) {
        int sum = 0;
        Map<Integer, Integer> cache = new HashMap<>();
        for (int input : inputs) {
            cache.computeIfAbsent(input, this::computeExpensive);
            sum += cache.get(input);
        }
        return sum;
    }
}