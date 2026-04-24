package com.streams;

import java.util.ArrayList;
import java.util.List;

public class ListConceptsDemo {
    public static void main(String[] args) {
        //Approach 1 for creating List
        List<String> names = new ArrayList<>();
        names.add("Milya");
        names.add("Tom");
        names.add("Test");
        names.add("Rom");

        System.out.println(names);

        names.add("Tim");
        System.out.println(names);

        names.remove("Test");
        System.out.println(names);

        names.set(3, "Lusa"); //Updating element
        System.out.println(names);
    }

}
