package com.accessmodifiers2;

import com.accessmodifiers.Student;

public class ChildClass extends Student {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.displayName();
        System.out.println(child.name);
    }
}
