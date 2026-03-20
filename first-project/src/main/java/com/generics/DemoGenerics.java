package com.generics;

public class DemoGenerics {

    //Generics are used to create parameterized types in Java
    //Generics works with only Classes, Interface and Enum
    //Generic helps in Type safety
    /*
    A-Z
    E - Element - java collections framework, K - Key
    V - value, T - type
     */

    class Classname <T>{
        T value;
    }

    static class Container <T>
    {
        //int
        T value;
        T id;
        T key;
    }


    public static void main(String[] args) {
        //Container obj = new Container();
        //obj.value = "jjh";

        Container<Integer> obj = new Container<Integer>();
        obj.value = 123;
        obj.id = 101;
        obj.key = 78;

        Container<String> obj1 = new Container<String>();
        obj1.value = "jhjh";
        obj1.id = "Milya";
        obj1.key = "apple";




    }
}
