package com.optimization;

import java.util.List;
/* Excessive autoboxing/unboxing can lead to a surge of temporary objects and trigger 
 * more frequent garbage collections, harming throughput and latency.
 */

public class AutoboxingExample {
    // Inefficient: Many Integer objects created/unboxed.
    public long sumWithBoxing(List<Integer> numbers) {
        long sum = 0;
        for (Integer num : numbers) {
            sum += num; // unboxing each Integer → int
        }
        return sum;
    }

    // Efficient: Primitives avoid object churn.
    public long sumWithPrimitives(int[] numbers) {
        long sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}