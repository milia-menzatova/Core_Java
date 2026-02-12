package com.abstraction;

@FunctionalInterface
interface FuncInteface{
    void method();
     default void method2(){
        //two abstraction method not allowed
         //need to use default key word or static
         System.out.println("Default method");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

    }
}
