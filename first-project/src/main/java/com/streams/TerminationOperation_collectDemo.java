package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminationOperation_collectDemo {
    public static void main(String[] args) {
        //collector - collect into list/set/map
        List<String> fruits = Arrays.asList("Banana", "Apple", "Apple",
                "Banana", "Orange", "Mango","Kiwi", "Kiwi");

        //collect to list
        List <String> longFruits = fruits.stream()
                .filter(n->n.length()>5)
                .collect(Collectors.toList());
        System.out.println(longFruits);

        //collect as Set // only unique values will return
        Set<String> uniqueFruits = fruits.stream().distinct()
                .collect(Collectors.toSet());
        System.out.println(uniqueFruits);

        //collect as Map (key, value) - word, length of word
        Map<String,Integer> map = fruits.stream()
                .distinct()
                .collect(Collectors.toMap(w->w,w->w.length()));
        System.out.println(map);
        //Output Apple=5, Kiwi=4, Mango=5, Orange=6, Banana=6}


    }
}
