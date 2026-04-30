package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediaStreamOperationsDemo {
    public static void main(String[] args) {

        //Filter() - based on condition - keep only matching elements
        List<Integer> num1 = Arrays.asList(10, 20, 30, 40, 50);
        Stream<Integer> st1 = num1.stream().filter(n-> n%20==0);
       // st1.forEach(n-> System.out.println(n));


        //Map(Function) - Transform each element, transform to another stream
        List<String> names = Arrays.asList("Milya", "Test", "Tom");
        Stream<Integer> namesLength = names.stream().map(n->n.length());
       // namesLength.forEach(n-> System.out.println(n));

        //Distinct() - remove duplicates
        List<Integer> num2 = Arrays.asList(1,1,1,1,1,5,7,7, 88);
        Stream<Integer>str3 = num2.stream().distinct();
        str3.forEach(n-> System.out.println(n));

    }
}
