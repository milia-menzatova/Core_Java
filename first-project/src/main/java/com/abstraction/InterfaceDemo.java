package com.abstraction;

interface Book {
    int numOfPages = 150;// final static variables
    String author = "Milya";

    void method1();  //abstract method without body
    default void method2(){
        System.out.println("we need use key word default");
    }
   static void method3(){
        System.out.println("we need yo specify static or default");
    }

}
public class InterfaceDemo {
    public static void main(String[] args) {

    }
}
