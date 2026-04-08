package com.collection;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7};
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(!hs.add(arr[i])){
                System.out.println(arr[i]);
            } // ! will show duplicate // without ! will show unique symbols
            //HasSet can store unique values

        }

    }
}
