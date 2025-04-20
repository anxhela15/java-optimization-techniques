package com.optimization;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenationExampleTest {
    @Test
    void testConcatMethods() {
        StringConcatenationExample example = new StringConcatenationExample();
        List<String> items = Arrays.asList("a", "b", "c");
        assertEquals("abc", example.concatWithPlus(items));
        assertEquals("abc", example.concatWithStringBuilder(items));
    }
}