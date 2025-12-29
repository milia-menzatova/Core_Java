package com.strings.examples;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "    M   i    L y  a";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
