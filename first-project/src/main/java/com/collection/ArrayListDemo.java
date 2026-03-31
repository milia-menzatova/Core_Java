package com.collection;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        //Declaration or creating object
        ArrayList arrList = new ArrayList();

        ArrayList<Integer> myList = new ArrayList<Integer>();

        arrList.add(100);
        arrList.add("Milya");
        arrList.add(true);
        arrList.add(234.567);
        arrList.add(null);
        arrList.add(100);


        //Size of the ArrayList
        int size = arrList.size();
        System.out.println(size);

        //Print the values in the array list
        System.out.println(arrList);

        //Removing the elements - ArrayList
        arrList.remove(5);
        System.out.println(arrList);

        //Insert element at specific index
        arrList.add(3, "Test"); //index, value
        System.out.println(arrList);

        //Modify at specific  index in ArrayList
        arrList.set(4, "Modify"); //size, value
        System.out.println(arrList);

        //Retrieve the value at specific index
        System.out.println(arrList.get(1));

        //Retrive all elements from Arraylits with Index

       /* //1. - for loop
        for(int i=0; i<=arrList.size()-1; i++){
            System.out.println(arrList.get(i));
        }

        */
        //2. - for each loop / Enhanced for loop
        //for(Object x:arrList){
          //  System.out.println(x);

        //3 - Using Iterator - Java Collections
        Iterator it = arrList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }

        //Checking ArrayList is Empty or not
        System.out.println(arrList.isEmpty());

        //Remove some elements from the array list
        //[100, Milya, true, Test, Modify, null]

        ArrayList list2 = new ArrayList();
        list2.add("Test");
        list2.add(null);
        list2.add(100);

        arrList.removeAll(list2);
        System.out.println(arrList);


    }
}
