package com.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        //Declaration
        HashSet hs = new HashSet();
       // Set myset = new HashSet();
      // HashSet<Integer> set = new HashSet<>();

       //Adding Elements into the HashSet
       hs.add(null);
       hs.add("Test");
       hs.add(true);
       hs.add(56.99);
       hs.add(500);
       hs.add("Test");
       hs.add(null);
       hs.add(500);
       System.out.println(hs);

       //Remove element from hashSet
        hs.remove(500);
        System.out.println(hs);

       //Insert in the middle of the hashSet - not possible in hash

       //Retrieve specific element using Index - not possible


    }
}
