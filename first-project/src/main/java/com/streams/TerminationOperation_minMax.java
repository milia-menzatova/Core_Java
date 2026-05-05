package com.streams;

import java.util.Arrays;
import java.util.List;

public class TerminationOperation_minMax {
    public static void main(String[] args) {
        //min - find min element
        //max - find max element
        List<Integer> marks = Arrays.asList(56, 78, 99, 1000, 34, 67);
        int minMarks = marks.stream().min((a,b)->a-b).get();
        System.out.println(minMarks);

        int maxMarks = marks.stream().max((a,b)->a-b).get();
        System.out.println(maxMarks);

    }
}
