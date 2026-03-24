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

        //Size of the ArrayList
        int size = arrList.size();
        System.out.println(size);


    }
}
