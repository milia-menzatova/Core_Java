package com.lambda;
//Anonymous Class - is a class without a name,
// it's declared and implemented in a single expression with a body.
// It's used for a class for one time purpose.
//Can be implemented for Interfaces and Classes
public class AnonymousClassExample {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface(){

            @Override
            public void display() {
                System.out.println("Anonymous Class Example with Interface");
            }

            @Override
            public void print() {

            }
        };
        obj.display();

    }
}
