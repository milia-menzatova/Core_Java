package com.generics;

public class GenericsDemo2 {

    static class Test<T1, T2>
    {
        T1 id;
        T2 name;
    }
    public static void main(String[] args) {
        Test<Integer, String> obj = new Test<Integer, String>();
        obj.id = 100;
        System.out.println(obj.id);
        //obj.id = "Milia"; showing error

        obj.name = "Milya";
        System.out.println(obj.name);

    }
}
