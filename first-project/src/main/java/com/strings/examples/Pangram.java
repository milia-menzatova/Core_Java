package com.strings.examples;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        int flag = 1;
        // all 26 alphabets
        str = str.toLowerCase();
        if(str.length()<26) {
            System.out.println(str + " is not Pangram String");
        }
        else {
            for(char ch='a'; ch<='z'; ch++){
                if(str.indexOf(ch)<0) { //one alphabet is missing - not Pangram String
                        flag = 0;
                }


            }
            if(flag == 1) {
                System.out.println(str + " is an Pangram String");
            }
            else {
                System.out.println( str + " Not a Pangram");
            }

        }
    }
}
