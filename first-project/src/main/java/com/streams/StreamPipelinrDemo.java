package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinrDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Milya", "Amira", "Fevzi", "Melek", "Milya", "Amira", "Toma");
        names.stream().distinct() //remove duplicates
                .filter(n->n.length()>3) //apply filter greater then 3
                .map(n->n.toUpperCase()) //transformer element to another format
                .forEach(n-> System.out.println(n)); //print

    }
}
