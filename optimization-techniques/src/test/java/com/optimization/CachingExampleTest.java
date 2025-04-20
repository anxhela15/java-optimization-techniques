package com.optimization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CachingExampleTest {
    @Test
    void testSumCachingProducesSameResult() {
        CachingExample example = new CachingExample();
        int[] inputs = {2, 3, 2, 3};
        assertEquals(example.sumWithoutCaching(inputs), example.sumWithCaching(inputs));
    }
}