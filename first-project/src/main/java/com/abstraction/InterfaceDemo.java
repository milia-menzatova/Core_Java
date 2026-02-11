package com.abstraction;

interface Book {
    int numOfPages = 150;// final static variables
    String author = "Milya";

    void method1();  //abstract method without body
    default void method2(){
        System.out.println("Default method");
    } //we need use key word default
   static void method3(){
        System.out.println("Static method");
    }

}
public class InterfaceDemo implements Book{

    public void method1(){
        System.out.println("Abstract method code");
    }

    void method4(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
      /*InterfaceDemo obj = new InterfaceDemo();
      obj.method1();
      obj.method2();
      //obj.method3();//we cannot write like this
      Book.method3(); //Using Interface we can call static method

       */
        //Case 2. Using Interface reference variable to call the child class
        //Book bk = new Book(); //not possible to create obj for interface
        Book bk = new InterfaceDemo(); //to use child class
        bk.method1();
        bk.method2();
        Book.method3();
        InterfaceDemo demo = new InterfaceDemo();
        demo.method4("Milya");

    }
}
