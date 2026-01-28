package com.inheritance;

class Parent2{
    int a = 10;
    void display(){
        System.out.println(a);
    }
}

class child extends Parent2{
    int b = 20;
    void print(){
        System.out.println(b);
    }
}

class child2 extends Parent2{
    int c = 30;
    void present(){
        System.out.println(c);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {

        child kid1 = new child();
        System.out.println(kid1.a);
        kid1.display();

        System.out.println(kid1.b);
        kid1.print();

    }
}
