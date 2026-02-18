package com.accessmodifiers;

// 1). Public
// - Accessible from everywhere;
// same class, same package, subclass, different package

//2. Protected
//- Accessible in the same package and subclasses

//3. Default
// - Accessible in the same package
// We don't need to specify default keyword (No keyword required)

//4. Private
//Accessible in the same class
public class Student {
    //variable
    protected String name; //protected vs protected

    // Constructor
     public Student(){
         name = "Milya";
         System.out.println("Default Consructor");
     }

     //method
    protected void displayName(){
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.displayName();
        System.out.println(student.name);

    }
}
