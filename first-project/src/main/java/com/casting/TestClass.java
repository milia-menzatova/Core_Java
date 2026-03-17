package com.casting;


class A{

}

class B extends A{

}

class C extends B{

}
public class TestClass {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A a1 = new B();
        A a2 = new C();
        B b1 = new C();

        C c1 = (C)new A();

    }
}
