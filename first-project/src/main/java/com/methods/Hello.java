package com.methods;

public class Hello {
    // no variables
    //No input params, No return type

    void message1(){
        System.out.println("Milya");

    }

    //2. No input params, Return type
    void message2(){
        System.out.println("Hello");



    }

    int message3(){
        int a = 10;
        a++;
        return a;
    }
    // 3. Has input params, no return type
    void massage4(String name){
        System.out.println(name);

    }
    //4. Has input Params and return type
    String massage5(String firstName, String lastName){
      return firstName + " " + lastName;
    }
}

