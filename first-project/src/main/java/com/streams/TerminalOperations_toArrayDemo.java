package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperations_toArrayDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Grape", "Mango");
        Stream<String> st = fruits.stream().map(n->n.toUpperCase());
        String [] fruitArray = st.toArray(n-> new String[4]);
        System.out.println(Arrays.toString(fruitArray));



    }
}
