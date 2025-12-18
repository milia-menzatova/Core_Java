package com.strings.examples;

import java.util.Arrays;

public class MutableVsImmutableObjects {
    public static void main(String[] args) {

        //mutable - we can change the value in the memory
        int arr[] = {11, 78, 4, 0, 3, 78, 88, 77, 34, 6, 7, 8, 3};
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");

        Arrays.sort(arr); //sorting in the memory
        System.out.println(Arrays.toString(arr));


        System.out.println("-----------------------------------------");

        StringBuffer sb = new StringBuffer("Welcome");
        System.out.println(sb);

        sb.append(" to java Strings");
        System.out.println(sb);

        //immutable - we cannot change the value in the memory
        String str = new String("Welcome");
        System.out.println(str);

        String str2 = str.concat("to Java Strings");
        System.out.println(str);
    }
}

