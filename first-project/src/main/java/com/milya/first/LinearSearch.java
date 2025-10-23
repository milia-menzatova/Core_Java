package com.milya.first;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {
                10, 22, 9, 55, 88, 33, 11, 99
        };
        int num = 11;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                System.out.println("Number is found in the array");
                break;
            }


        }
    }
}
