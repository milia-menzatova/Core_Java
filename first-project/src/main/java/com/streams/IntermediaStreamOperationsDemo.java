package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediaStreamOperationsDemo {
    public static void main(String[] args) {

        //Filter() - based on condition
        List<Integer> num1 = Arrays.asList(10, 20, 30, 40, 50);
        Stream<Integer> st1 = num1.stream().filter(n-> n%20==0);
        st1.forEach(n-> System.out.println(n));
    }
}
