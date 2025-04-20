package com.optimization;

import java.util.List;

public class LoopOptimizationExample {
    public int sumWithIndexLoop(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public int sumWithCachedSizeLoop(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0, size = numbers.size(); i < size; i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public int sumWithForEach(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}