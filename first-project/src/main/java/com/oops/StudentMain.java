package com.oops;

public class StudentMain {

   //main method - execution starting point
    public static void main(String[] args) {

        //Object creation
        Student student1 = new Student();

        //define values for the variables
        student1.rollnum = 10;
        student1.name = "Milya";
        student1.grade = 'D';
        student1.address = "Canada";

        //call method
        student1.displayAllValues();
        student1.displayRollNum();

        Student student2 = new Student();
        student2.rollnum = 44;
        student2.name = "Tom";
        student2.grade = 'A';
        student2.address = "Canada";

        student2.displayRollNum();
        student2.displayAllValues();



    }
}
