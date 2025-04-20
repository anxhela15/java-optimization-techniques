package com.optimization;

import java.util.List;

public class StringConcatenationExample {
    public String concatWithPlus(List<String> items) {
        String result = "";
        for (String item : items) {
            result += item;
        }
        return result;
    }

    public String concatWithStringBuilder(List<String> items) {
        StringBuilder sb = new StringBuilder();
        for (String item : items) {
            sb.append(item);
        }
        return sb.toString();
    }
}