package com.overriding;
class ParentClass{
    void display(){
        System.out.println("Parent display method");
    }
}
class ChildClass extends ParentClass{
    void display(){
        System.out.println("Child display method");
    }
}


public class OverrideAnnotation {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.display();

    }
}
