package com.strings.examples;

public class ReverseEachWordInAGivenString {
    public static void main(String[] args) {
        String str = "Creating Bright Future";

        String words[] = str.split(" "); //splitting the String into words
        String ReverseString = "";

        for(String w:words){
            String reverseWord = ""; // empty string
            for(int i=w.length()-1; i>=0; i--){
                reverseWord = reverseWord + w.charAt(i); // Reverses each words character by character

            }
            ReverseString = ReverseString + reverseWord + " ";

        }

        System.out.println(ReverseString);
    }
}
