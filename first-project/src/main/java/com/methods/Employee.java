package com.methods;

public class Employee {

    int empID;
    String empName;
    double salary;

    //Initialize values
    void setEmployeeData(int id, String name, double sal){
        empID = id;
        empName = name;
        salary = sal;

    }
    void printEmployeeData(){
        System.out.println(empID + " " + empName + " " + salary);
    }

    //main method
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        //1. - Approach - define some values to variables
      //  employee1.empID = 100;
       // employee1.empName = "Milya";
       // employee1.salary = 500.67;

        //2. - Approach - define values using another method
        employee1.setEmployeeData(200, "Milya", 1000.99);

        employee1.printEmployeeData();

    }
}
/* 1.  Method name can be anything
Constructor name is same as the Class name

    2.   Method has return type  - if no return type we specify -> void
*        Constructor we do not need to specify return type
    3. Method take input parameters
       Constructor can take input parameters
    4. Method we can call using the objects
       Constructor we will call using the object creation - automatically
    5. Methods are used to define logic (for loop, complex logic)
       Constructor we will use it to Initialize values
*
*
* */