package com.lambda;

public class AnonymousClassExampleUsingClasses {
    public static void main(String[] args) {
        MyClass obj = new MyClass(){

            public void displayMethod(){
                System.out.println("Anonymous Class Example using an Parent Class");
            }
        };
    }
}
