package com.optimization;

import java.io.*;
/* Unbuffered I/O invokes a system call on every read/write, which is 
* slower than buffered streams that batch data in user‑space buffers.
*/
public class BufferIOExample {

    // Unbuffered: many small, costly syscalls
    public byte[] readUnbuffered(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            return fis.readAllBytes();
        }
    }

    // Buffered: fewer syscalls, better throughput
    public byte[] readBuffered(File file) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            return bis.readAllBytes();
        }
    }
}