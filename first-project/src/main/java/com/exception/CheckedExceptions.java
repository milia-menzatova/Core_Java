package com.exception;

public class CheckedExceptions {

    //Checked Exceptions - we can handle in two ways
    // 1). Try cath - code will be written in
    //2). Throws keyword in try block and exception we handle in the catch block

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start of the program");
        System.out.println("Statement1");

       /*
        try{ Thread.sleep(5000);

        } catch (InterruptedException e){
            e.printStackTrace();
        }
        */

        Thread.sleep(5000); //throws


        System.out.println("Statement2");
        System.out.println("End of the program");
    }
}
