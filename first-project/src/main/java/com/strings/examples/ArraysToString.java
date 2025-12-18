package com.strings.examples;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        String str = "Milya Academy";
        String s[] = str.split(" ");
        String web[] = {"Java", "Python", "JavaScript"};
        //System.out.println(s);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(web));
    }
}
