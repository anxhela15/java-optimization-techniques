package com.optimization;

import java.text.SimpleDateFormat;
import java.util.Date;

/* ThreadLocal provides each thread its own copy of a variable, avoiding synchronization 
* overhead—but beware of potential memory leaks if not cleared.
*/

public class ThreadLocalExample {
    // Thread-safe formatter without synchronization
    private static final ThreadLocal<SimpleDateFormat> FORMATTER =
        ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public String formatDate(Date date) {
        return FORMATTER.get().format(date);
    }
}
