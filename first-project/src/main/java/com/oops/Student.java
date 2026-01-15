package com.oops;

public class Student {
    //variables
    int rollnum;
    String name;
    char grade;
    String address;

    //methods
    void displayAllValues(){
        System.out.println(rollnum);
        System.out.println(name);
        System.out.println(grade);
        System.out.println(address);
    }
    void displayRollNum(){
        System.out.println("RollNum value is : " + rollnum);
    }



    public static void main(String[] args) {
        // creating the object
        Student stu1 = new Student();
        //assigned some values to the variables in the run time
        stu1.rollnum = 1;
        stu1.name = "Milya";
        stu1.grade = 'A';
        stu1.address = "Canada";

        //call methods
        stu1.displayAllValues();
        stu1.displayRollNum();

           }

    }

