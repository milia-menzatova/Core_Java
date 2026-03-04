package com.exception;

import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        Scanner sc = new Scanner(System.in);

        //Example1
        try {
            System.out.println("Enter an Number: ");
            int num = sc.nextInt();
            System.out.println(100/num);

            sc.close();
            System.out.println("End of the program");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
