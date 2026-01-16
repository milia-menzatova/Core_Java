package com.methods;

public class Recursion {
    //Is an algorithm
    // 1. Method will be calling itself - infinite loop
    //2. Condition - will  be used to break the loop

    //Example: Print number from 1 to 10
    public static void main(String[] args) {
        int num = 10;
        printNumbers(num);
        // for(int i = 1; i<=num; i++){
        //   System.out.println(i);
        //}
    }


    public static void printNumbers(int x) {
        if (x < 1) //condition
            return;
        printNumbers(x - 1);
        System.out.println(x);

    }
}

