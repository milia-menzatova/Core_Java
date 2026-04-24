package com.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo_2 {
    public static void main(String[] args) {
        //Approach 2
        List<String> title = Arrays.asList("Milya", "Tom", "Test");
        System.out.println(title);

       /* title.add("Flower");
        System.out.println(title); //not supported to add  new element

        */

        //remove / add are not supported, only we can update elements
    }
}
