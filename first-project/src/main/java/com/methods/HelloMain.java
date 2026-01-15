package com.methods;

public class HelloMain {
    public static void main(String[] args) {
        Hello h1 = new Hello();

        //calling the method
        h1.message1();

        h1.message2();

        int x = h1.message3();
        System.out.println(x);

        h1.massage4("Milya");
        h1.massage5("Anif", "Milya");

    }

}
