package com.streams;

import java.util.Arrays;
import java.util.List;

public class TerminalOper_count {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("gg", "f", "c","a", "b", "d");
        long countValue = letters.stream().count();
        System.out.println(countValue);
    }
}
