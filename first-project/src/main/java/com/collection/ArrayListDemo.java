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


    }
}
