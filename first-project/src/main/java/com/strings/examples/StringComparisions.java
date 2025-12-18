package com.strings.examples;

public class StringComparisions {
    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "Welcome";

        System.out.println(str1==str2); // boolean
        System.out.println(str1.equals(str2)); //boolean

        //== it will compare the objects // equals method will compare the value of the objects
        System.out.println("-----------------------------------------");
        //Example 2 -- Heap Memory - outside the String Constant Pool
        String s1 = new String("Anif");
        String s2 = new String ("Anif");
        String s3 = new String ("Anif");

        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2)); // true

        System.out.println("-------------------Example 3 --------------");
        //Example 3
        String str4 = "Welcome";
        String str5 = new String("Welcome");
        System.out.println(str4==str5); // false
        System.out.println(str4.equals(str5)); // value true

    }
}