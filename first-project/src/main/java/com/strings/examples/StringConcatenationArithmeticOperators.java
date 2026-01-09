package com.strings.examples;

public class StringConcatenationArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("java" + 10 + 20); //output java1020
        System.out.println(10 + 20 + "java"); //output 30java
        System.out.println(10 + 20 + "java" + 10 + 20); //output 30java1020

        //Arithmetic Operators
        System.out.println("java" + (10 - 20)); // - cannot be applied in java, need to use brackets

        System.out.println("java" + 10 * 20); //output java200
        System.out.println(30 * 40 + "java"); // output 1200java

        System.out.println("java" + 50/100); //output java0
        System.out.println(100/50 + "java"); //output 2java
        System.out.println(500/100 + "java" +40/20); //output 5java2

        System.out.println(300 % 100 + "java"); //output 0java - reminder value 0
    }
}
