package com.strings.examples;

public class PrintNumbers {
    public static void main(String[] args) {
        //Print numbers 1 to 100
        // we should not use any numbers in the program

        //by using ASCII Table

       // int one = 'A' / 'A';
        //System.out.println(one); // output 65 // 1

        int one = 'A' / 'A';
        String str = "qqqqqqqqqq";
        int len = str.length(); // 10

        for(int i = one; i <= len * len; i++){
            System.out.println(i);

        }

        //Second way
        for(int i = one; i <= 'd'; i++){ //d = 100
            System.out.println(i);

        }

        //Third way
        String str1 = "programming"; //10
        int zero = str1.length() - str1.length(); //0
        int hundred = str1.length() * str1.length();

        for( int i = zero; i<hundred; i++){
            System.out.println(i);

        }


    }
}
