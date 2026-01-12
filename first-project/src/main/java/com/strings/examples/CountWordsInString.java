package com.strings.examples;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "Java java java academy";
        int count = 1; // initialize with 1

        for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == ' ' && str.charAt(i + 1)!= ' '){
            count++;
        }
        }
        System.out.println(count);


    }
}
