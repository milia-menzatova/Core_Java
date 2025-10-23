package com.strings.examples;

import java.util.SplittableRandom;

public class ContainsMethod {
    public static void main(String[] args) {
        // contains() - returns boolean - true/false
        String str = "Kitchener";
        String str1 = "itcheNer";
        System.out.println(str.contains(str1)); // it will return true because
        // "Kitchener" contains "itchener"

        //equals - compare Strings - boolean - true / false should be exactly matching

        String str2 = "Waterloo";
        String str3 = "waterloo"; // return false
        System.out.println(str2.equals(str3));

        System.out.println("---------------------------------------------");
        //equalsIgnoreCase - compare strings - it will check actual value, will
        // ignore upper case or lower case
        String str4 = "WATERLOO";
        String str5 = "waterloo"; // return true
        System.out.println(str4.equalsIgnoreCase(str5));
    }
}
