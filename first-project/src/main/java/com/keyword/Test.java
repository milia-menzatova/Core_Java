package com.keyword;

public class Test {

    Test(){
        System.out.println("default constructor");
    }

    Test(String str){
        System.out.println(str);

    }

    Test(String str, int x){
        this("Test"); //will call default constructor
        System.out.println(str + " " +x);

    }
    public static void main(String[] args) {
        Test obj = new Test("Mily", 100);

    }

}
