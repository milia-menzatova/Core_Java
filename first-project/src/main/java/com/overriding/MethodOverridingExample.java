package com.overriding;
//parent
class Bank{

    double interestRate(){ //<---method
      return  5.5;
    }

}

class RBC extends Bank{
    //child 1
    double interestRate(){
        return 7.5;
    }
}

class RSF extends Bank {
    @Override
    double interestRate() {
        return 9.5;
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        RBC child1 = new RBC();
        child1.interestRate();
        double ch1 = child1.interestRate(); // we need to store in some variable,
        // we cannot see it in console
        System.out.println(ch1);

        RSF child2 = new RSF();
        child2.interestRate();
        double ch2 = child2.interestRate();
        System.out.println(ch2);
    }

}
