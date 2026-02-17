package com.abstraction;

public class WrapperClassesExample {
    public static void main(String[] args) {
        int a = 10;
        double d = 123.56;
        char ch = 'S';
        boolean v = true;

        String str1 = String.valueOf(a);
        System.out.println(str1);

        String str2 = String.valueOf(d);
        System.out.println(str2);
    }
}
