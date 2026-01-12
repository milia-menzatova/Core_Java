package com.strings.examples;

public class CountOccurencesOfCharacterInString {
    public static void main(String[] args) {
        String str = "Java String Example";
       int len = str.length(); //length of the string
       // str.replace("a", ""); // all the will replaced with empty value
       int temp = str.replace("a", "").length();
       int count = len - temp; // this will count of an occurrences
        System.out.println(count);
    }
}
