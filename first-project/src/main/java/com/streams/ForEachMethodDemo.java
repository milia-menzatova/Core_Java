package com.streams;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodDemo {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(23, 32, 11, 43, 88);
        arr.forEach(n -> System.out.println(n));

       /* //Normal for loop
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i) );
        }

        */

        /*//Enhanced for loop - foreach
        for(int i:arr){
            System.out.println(i);
        }
        */


    }


}
