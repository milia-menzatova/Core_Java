package com.methods;

public class ConstructorDemo {
    //variables
    int a;
    int b;

    ConstructorDemo() { //Default Constructor
        a = 100;
        b = 200;
    }

    ConstructorDemo(int x, int y){ //Parameterized Constructor
         a = x;
         b = y;
    }

    void sum(){               // method
        System.out.println(a+b);
    }

    //main method - execution
    public static void main(String[] args) {
      // Default Constructor
      ConstructorDemo cd1 = new ConstructorDemo(); //object
      cd1.sum(); // calling method

     //Parametrized constructor
     ConstructorDemo cd2 = new ConstructorDemo(300, 700);
     cd2.sum();



    }
}
