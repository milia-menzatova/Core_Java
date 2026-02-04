package com.keyword;

import java.sql.SQLOutput;

class Car{
    int speed = 100;
}

class BMW extends Car{
    int speed = 150; //overdid variables
    void displaySpeed() {
        System.out.println("Test" + speed);
        System.out.println(super.speed);
    }

}
public class SuperKeyword {
    public static void main(String[] args) {
        BMW car = new BMW();
        car.displaySpeed();

        System.out.println(car);
    }

}
