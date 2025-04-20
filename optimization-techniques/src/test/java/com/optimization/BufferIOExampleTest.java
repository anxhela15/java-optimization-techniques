package com.optimization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.nio.file.Files;

public class BufferIOExampleTest {

    @Test
    void testReadBufferedAndUnbuffered() throws IOException {
        BufferIOExample example = new BufferIOExample();
        File tempFile = File.createTempFile("test", ".txt");
        tempFile.deleteOnExit();
        String content = "Sample content for testing.";
        Files.writeString(tempFile.toPath(), content);

        byte[] unbufferedData = example.readUnbuffered(tempFile);
        byte[] bufferedData = example.readBuffered(tempFile);

        assertArrayEquals(unbufferedData, bufferedData);
        assertEquals(content, new String(bufferedData));
    }
}
