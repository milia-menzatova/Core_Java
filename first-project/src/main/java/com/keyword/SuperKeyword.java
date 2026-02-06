package com.keyword;

import java.sql.SQLOutput;

class Car{
    int speed = 100;
    void accelerate(){
        System.out.println("Accelerate method in the Parent class");
    }
}

class BMW extends Car{
    int speed = 150; //overdid variables
    void displaySpeed() {
        System.out.println("Test" + speed);
        System.out.println(super.speed);
    }
    void accelerate(){
        //System.out.println("Accelerate method in the Child class");
        super.accelerate();
        //Immediate parent class method we cannot use in main, only in the child clas
        // to call parent class
    }

}
public class SuperKeyword {
    public static void main(String[] args) {
        BMW car = new BMW();
        car.displaySpeed();

        BMW obj = new BMW();
        obj.accelerate();

        System.out.println(car);
    }

}
