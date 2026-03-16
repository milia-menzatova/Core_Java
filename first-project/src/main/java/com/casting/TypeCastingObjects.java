package com.casting;

class Parent
{
    String name = "Milya";
    void method1(){
        System.out.println("Parent method");
    }

}

class Child extends Parent
{
   int a = 100;
   void method2(){
       System.out.println("Child method");
   }
}
public class TypeCastingObjects {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.method1();
        System.out.println(ch.name);

        ch.method2();
        System.out.println(ch.a);

        //Up Casting
        //Parent p = new Parent(); //Parent class object
        Parent p = new Child(); //automatic conversion
        p.method1();
        System.out.println(p.name);

        //p.method2();
       // System.out.println(p.a);

       //Down casting
       Child c = (Child)new Parent(); //Manual casting with Child class
        System.out.println(c.name);
        c.method1();
        System.out.println(c.a);
        c.method2();
    }
}
