package com.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperations_reduceDemo {
    public static void main(String[] args) {
        //Reduce method - reduce elements into one value
        List<Integer> num = Arrays.asList(10, 20, 30, 40, 8);
        int sum = num.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
