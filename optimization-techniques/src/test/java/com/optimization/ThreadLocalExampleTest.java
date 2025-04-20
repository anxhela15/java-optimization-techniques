package com.optimization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalExampleTest {

    @Test
    void testFormatDate() throws ParseException {
        ThreadLocalExample example = new ThreadLocalExample();
        String dateString = "2025-04-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateString);
        assertEquals(dateString, example.formatDate(date));
    }
}
