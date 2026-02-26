package com.exception;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {

        System.out.println("Start of the program");
        Scanner sc = new Scanner(System.in);
       /*
        //Example1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int num = sc.nextInt();

        System.out.println(100/num);

        */

        //Example2
       /* int arr[] = new int[5];
        System.out.println("Enter an position(0-4): ");
        int position = sc.nextInt();

        System.out.println("Enter an value:");
        int value = sc.nextInt();

        arr[position] = value;
        System.out.println(arr[position]);
        System.out.println(value);
        */

        //Example3
       /*// String str = "12345";
        String str = "Milya";
        int num = Integer.parseInt(str);
        System.out.println(num);

        */
        //Example4
        //String s = "Milya";
       // String s = "";
        String s = null;
        System.out.println(s.length());

        System.out.println("End of the program");

    }
}
