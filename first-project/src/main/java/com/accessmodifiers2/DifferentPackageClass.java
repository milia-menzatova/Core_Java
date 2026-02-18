package com.accessmodifiers2;

import com.accessmodifiers.Student;

public class DifferentPackageClass {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.displayName();
        System.out.println(stu1.name);

    }

    // When protected - Accessible in the same package and subclasses
    // subclass class can be the same of different package
}
