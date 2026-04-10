package com.exercise;

import java.util.HashSet;

public class PangramStringProgram {
    //A-z = 26 alphabets
    //HashSet - will not have duplicate values, unique

    public static void main(String[] args) {
        //String str = "The quick brown fox jumps over the lazy dog %@##$%%";
        String str = "Milia";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        //all spaces, special will be removed
        System.out.println(str);

        //check the length if it less then 26 is not a pangram
        if(str.length() <26){
            System.out.println("Not a Pangram Less");
        }
        else {
            HashSet<Character> hs = new HashSet();
            for(int i=0; i<str.length(); i++){
               hs.add(str.charAt(i));
            }
            if(hs.size() ==26)
                System.out.println("Pangram String");
            else
                System.out.println("Not a Pangram");
        }
    }
}
