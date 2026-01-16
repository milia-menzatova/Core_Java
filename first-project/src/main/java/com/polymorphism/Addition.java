package com.polymorphism;

public class Addition {
  /*
  Means many forms;
  Means the ability to take more than one form

  Method overloading - practical concept in Java
 1). Method names should be the same
 2). Number of parameters should be different
 3). Data type should be different - when number of parameters are the same
 4). Order of the data types should be different - when we have same data types

   */


    //variables
    int a, b;

    //methods
    void sum(){   //Case1 - no inputs
        a = 100;
        b = 50;

        System.out.println(a+b);
    }

    void sum(int x, int y){ //Case 2. - two inputs taken

        System.out.println(x+y);

    }

    void sum(int x, double y){ // Case 3. two inputs - different data type
        System.out.println(x+y);
    }

    void sum(double x, int y){// Case 4, two inputs - order of data types is changed

        System.out.println(x+y);

    }

    void sum(int x, int y, int z){ // case 5 - three inputs
        System.out.println(x+y+z);

    }
    public static void main(String[] args) {

    }
}
