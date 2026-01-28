package com.inheritance;
class Parent{
    int a = 10;
    void display(){
        System.out.println(a + "Parent");
    }
}

class Child1 extends Parent{
    int b = 20;
    void print(){
        System.out.println( b + "Child1");
    }
}

class Child2 extends Child1{
    int c = 30;
    void show(){
        System.out.println( c + "Child2");
    }
}

class Child3 extends Child2{
    int d = 40;
    void present(){
        System.out.println( d + "Child3");
    }
}
public class MultiLevel {



    public static void main(String[] args) {
        Child3 ch3 = new Child3();
        ch3.display();
        ch3.present();
        ch3.show();
        ch3.print();
        System.out.println(ch3.a);
    }
}
