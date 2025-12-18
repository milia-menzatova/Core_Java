package com.strings.examples;

public class ReverseAnString {
    public static void main(String[] args) {

        //Approach 1
        String str = "Welcome";
        String rev = "";

        for(int i = str.length() -1; i>=0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);

        //Approach 2

        String s = "Anif";
        String rev1 = "";

        char arr[] = s.toCharArray();
        for (int i = arr.length - 1; i>=0; i--){
           rev1 = rev1 + arr[i];
        }
        System.out.println(rev1);


    }
}
