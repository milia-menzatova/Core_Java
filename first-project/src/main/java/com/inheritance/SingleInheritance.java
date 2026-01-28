package com.inheritance;

class Base{
    int x = 100;
    int y = 200;

    void display(){
        System.out.println("Display method in parent");
    }
}

class SubClass extends Base{
    int a = 50;
    int b = 60;
    void print(){
        System.out.println("Print method in child class");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {

        //object creation for Child class
        SubClass obj = new SubClass();
        int var1 = obj.x; //Parent class variable
        System.out.println(var1);

        int var2 = obj.y; //Parent class variable
        System.out.println(var2);

        obj.display(); //Parent class method
        obj.print();


    }
}
