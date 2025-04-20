package com.optimization;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class LoopOptimizationExampleTest {
    @Test
    void testSumMethods() {
        LoopOptimizationExample example = new LoopOptimizationExample();
        var numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(15, example.sumWithIndexLoop(numbers));
        assertEquals(15, example.sumWithCachedSizeLoop(numbers));
        assertEquals(15, example.sumWithForEach(numbers));
    }
}