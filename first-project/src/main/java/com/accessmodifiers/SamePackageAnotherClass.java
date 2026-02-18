package com.accessmodifiers;

public class SamePackageAnotherClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayName();
        System.out.println(student.name);
    }
}
