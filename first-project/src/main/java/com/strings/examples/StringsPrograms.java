package com.strings.examples;

public class StringsPrograms {
    public static void main(String[] args) {

        // Concatenation: Joing two string together
        /*
        + on two strings it is Concatenation
        + on two int values (numbers) - it is addition
        + on one int value and one string -- Concatenation
         */
        String s1 = "Java" + 10 + 20 + 30 + 40;
        String s2 = 10 + 20 + "Java" + 30 + 40;
        String s3 = 10 + "20" + 30 + 40 + "50" + 60 + 70;
        String s4 = 10 + 20 + "Java" + (30 + 40 + 50) + "Language" + 60 + 70 + 80; // 30Java120Language607080
        String s5 = "November" + 20 + 30 + "December";

        System.out.println(s4);
        System.out.println(s5);


    }
}
