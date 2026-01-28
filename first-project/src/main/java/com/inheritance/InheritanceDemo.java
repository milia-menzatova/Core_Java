package com.inheritance;

class A{ //Parent
    int a = 10;
    void display(){
       // System.out.println(a);
    }
}

class B extends A{
    //child
    int b = 20;
    void print(){
       // System.out.println(b);
    }

}
public class InheritanceDemo {
    public static void main(String[] args) {
        //Inheritance - Acquiring all the properties (variables)
        // and Behavior (methods) from one class to another class

        A obj = new A(); //object creation for a class A
        System.out.println(obj.a + "A");
        obj.display();

        B objB = new B();
        System.out.println(objB.b + "B");
        objB.display();
        objB.print();


    }
}
/* Types of Inheritance:

1). Single inheritance - One parent amd one child
2). Multi level inheritance - One parent --> child 1 --> child 2 --> child 3
3). Hierarchy inheritance - One parent - multiple independent kids,  all child will be connected to one parent
4). Multiple Inheritance - Multiple parent - single child
   It is not possible using classes
   It is possible using Interface
 */