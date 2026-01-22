package com.keyword;

public class MyClass {
    //static variables
static int counter = 0;


// non static variable - instance variable
    int instanceNumber = 0;

//Default Constructor
    MyClass(){
        counter++;
        instanceNumber++;
    }

//static method
    static void displayCounter(){
        System.out.println(counter);
    }

//nonstatic method
    void displayInstanceNumber(){
        System.out.println(instanceNumber);
    }


    public static void main(String[] args) {
        MyClass.displayCounter(); //do need to create the object --static

        //declare object for nonstatic
        MyClass obj1 = new MyClass();

        displayCounter();
        MyClass obj2 = new MyClass();

        //accessing static members
        displayCounter();


    }
}
