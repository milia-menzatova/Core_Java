package com.abstraction;

@FunctionalInterface
interface FuncInteface{
    void method();
     default void method2(){
        //two abstraction method not allowed
         //need to use default key word or static
         System.out.println("Default method");
    }

    default void method3(){
        System.out.println("Default method 2");
    }
    static void method4(){
        System.out.println("Static method 1");
    }
    static void method5(){
        System.out.println("Static method 2");
    }
}

public class FunctionalInterfaceDemo implements FuncInteface{
    public static void main(String[] args) {

    }
    @Override
    public void method(){

    }
}
