package com.encapsulation;

public class BankAccount {
    /*
    Wrapping up of the data and methods together as a single unit - class
    1. Variables we will declare as private
    2. For every variable there should be two methods - public (set and get)
    3. Variables can be operated only using the method in the sane class
     */

    //variables
     private int accountNum;
     private String name;
     private double balance;

    //methods
    public int getAccountNum(){
        return accountNum;
    }
    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }



}
