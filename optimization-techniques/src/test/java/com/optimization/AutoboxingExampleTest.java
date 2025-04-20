package com.optimization;
    
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class AutoboxingExampleTest {

    @Test
    void testSumWithBoxing() {
        AutoboxingExample example = new AutoboxingExample();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long expectedSum = 15;
        assertEquals(expectedSum, example.sumWithBoxing(numbers));
    }

    @Test
    void testSumWithPrimitives() {
        AutoboxingExample example = new AutoboxingExample();
        int[] numbers = {1, 2, 3, 4, 5};
        long expectedSum = 15;
        assertEquals(expectedSum, example.sumWithPrimitives(numbers));
    }
}
