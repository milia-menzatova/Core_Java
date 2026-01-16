package com.encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {
      BankAccount acc = new BankAccount();
        acc.setAccountNum(1000201);
        int num = acc.getAccountNum();
        System.out.println(num);

        acc.setName("Milya");
        String name = acc.getName();
        System.out.println(name);
    }
}
