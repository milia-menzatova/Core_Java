package com.strings.examples;

public class SubstringMethod {
    public static void main(String[] args) {
        //substring() - return an string
        //retrieve part of a main string

        String str = "Toronto";
        System.out.println(str.substring(3)); //return onto

        String str1 = "Kitchener";
        System.out.println(str1.substring(0, 2)); // return Ki
        System.out.println(str1.substring(1, 3)); //it
        System.out.println(str1.substring(2, 4));//tc

        //to Uppercase
        // to Lower case

        String str2 = "milya";
        System.out.println(str2.toUpperCase());

        String str3 = "ANIF Milya";
        System.out.println(str3.toLowerCase());
    }
}
