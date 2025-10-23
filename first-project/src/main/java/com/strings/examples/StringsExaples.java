package com.strings.examples;

public class StringsExaples {
    public static void main(String[] args) {
        //Approach
        String str = "Milya";
        System.out.println(str);

        //Approach
        String str1 = new String("Anif");
        System.out.println(str1);

        //inbuilt methods - String class
        //length()

        int len = str.length();
        System.out.println(len);

        //concat method
        String s1 = "Milya";
        String s2 = "Anif";
        System.out.println(s1.concat( s2 ));
        System.out.println(s1+s2);

        //trim method - removing the spaces from both sides of the String

        String tram = "    Milya Anif     ";
        System.out.println(tram);
        System.out.println(tram.trim());

        //charAt() - returns an specified index in the String

        String qwer = "hghgsdfgfghsJava";
        System.out.println(qwer.charAt(4));
    }
}
