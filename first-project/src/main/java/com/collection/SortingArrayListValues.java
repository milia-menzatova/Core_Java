package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListValues {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(); // created arrayList variable
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);
        arrList.add(600);// insert

        System.out.println("Input Array List" +arrList);

        Collections.sort(arrList);
        System.out.println("Sorted array" +arrList); //will be Ascending from small to big

        Collections.sort(arrList,Collections.reverseOrder());
        System.out.println("Sorted array Desc" +arrList); //will be Ascending from bog to small
    }

}
