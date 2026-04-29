package com.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreationMethodsStreamDemo {
    public static void main(String[] args) throws IOException {
        //1. Crate stream using Lit/Set - Java collections
        List<Integer> values = Arrays.asList(22, 33, 75, 54);
        Stream<Integer> st = values.stream(); //stream object
        st.forEach(n -> System.out.println(n));

        Set<String> values2 = Set.of("Test", "Test3");
        Stream<String> st1 = values2.stream();
        st1.forEach(n-> System.out.println(n));

        //2. Using arrays
        String arr[] = {"Milya", "Test"};
        Stream<String> str3 = Arrays.stream(arr);
        str3.forEach(n-> System.out.println(n));

        //Stream.of passing direct values
       Stream<Integer> str4 = Stream.of(6, 88, 99, 4);
        str4.forEach(n-> System.out.println(n));

        //Stream.builder()
        Stream<String> str5 = Stream.<String>builder().add("Harry").add("Potter")
                .add("Flower").add("Tulip")
                .build();
        str5.forEach(n-> System.out.println(n));

        //Stream.generate() - Infinite Stream - random number - limit method
        Stream<Double> str6 = Stream.generate(() ->Math.random()).limit(5);
        str6.forEach(n-> System.out.println(n));

        //Stream.iterate() - Infinite Stream
        Stream<Integer> str7 = Stream.iterate(11, n->n+3).limit(7);
       str7.forEach(n-> System.out.println(n));

        //Reading data from Text files
        //Stream<String> str8 = Files.lines(Paths.get("test.txt"));
       // str8.forEach(n-> System.out.println(n));


    }

}
