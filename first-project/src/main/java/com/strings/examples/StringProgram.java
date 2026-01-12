package com.strings.examples;

public class StringProgram {
    public static void main(String[] args) {
        String str = "AuToMation"; // output is ATM
         //str = str.replaceAll( "[a-z]", ""); 1 approach
         // str = str.replaceAll("[^A-Z]", ""); // 2 approach

        String result = "";
        for(int i = 0; i < str.length(); i ++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                result = result + ch;
            }
        }
        System.out.println(result);
        //System.out.println(str);
    }
}
