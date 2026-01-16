package com.polymorphism;

public class AdditionMain {
    public static void main(String[] args) {
        //Execution  starts in the main method

        Addition obj = new Addition(); // create obj object
        obj.sum(); // no input
        obj.sum(100.5, 50); // double and int
        obj.sum(50, 50.5); // int, double
    }
}
