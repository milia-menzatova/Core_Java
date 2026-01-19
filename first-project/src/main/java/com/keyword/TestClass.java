package com.keyword;

public class TestClass {
    //methods

    void display1(){
        System.out.println("display1 method");
    }

    void display2(){
        display1();
        System.out.println("display2 method");
    }

    public static void main(String[] args) {
      TestClass call = new TestClass();
      call.display2(); // if call.display1() will print only display1()
    }
}
