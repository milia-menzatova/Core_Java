package com.strings.examples;

import java.util.SplittableRandom;

public class ContainsMethod {
    public static void main(String[] args) {
        // contains() - returns boolean - true/false
        String str = "Kitchener";
        String str1 = "itcheNer";
        System.out.println(str.contains(str1)); // it will return true because
        // "Kitchener" contains "itchener"
    }
}
