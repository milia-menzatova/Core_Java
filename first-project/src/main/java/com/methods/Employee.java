package com.methods;

public class Employee {

    int empID;
    String empName;
    double salary;


    void printEmployeeData(){
        System.out.println(empID + " " + empName + " " + salary);
    }
    //main method
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.printEmployeeData();

    }
}
