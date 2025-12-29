package com.strings.examples;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Iceman";
        String str2 = "cinema";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Check the length

        if(str1.length() == str2.length()){

            //convert Strings to Char Arrays
            char[] charrArray1 = str1.toCharArray();
            char[] charrArray2 = str2.toCharArray();

            //Sort the both Arrays
            Arrays.sort(charrArray1); // sorting will happen in memory
            Arrays.sort(charrArray2);

            // If both sorted char Arrays are same then it is anagram
            boolean result = Arrays.equals(charrArray1, charrArray2);

            if(result) {
                System.out.println(str1+ " and " +str2+ " is Anagram");

            }
            else {
                System.out.println(str1+ " and " +str2+ " are not Anagram");
            }
        }
        else{
            System.out.println(str1+  " and " +str2+ " are Not Anagram String");
        }

    }
}
