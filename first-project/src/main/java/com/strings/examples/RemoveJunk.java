package com.strings.examples;

public class RemoveJunk {
    public static void main(String[] args) {
        String str = "#&%^%^%^%^%1234 Java 54545^^&Course(66t6##$*&)";

        //Regular expression
        String str1 = str.replaceAll("[a-zA-Z0-9]","");
       System.out.println(str1); // will replace letters and numbers

      String str2 = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str2); // will replace special characters

      String str3 = str.replaceAll("[0-9]", "");
        System.out.println(str3); // will remove only numbers

      String str4 = str.replaceAll("[^0-9]", "");
        System.out.println(str4); // will return only numbers

      String str5 = str.replaceAll("[^a-zA-z]", "");
        System.out.println(str5);
    }
}
