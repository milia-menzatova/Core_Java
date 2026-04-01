package com.collection;

import java.util.*;

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

       //Convert the HashSet into ArrayList
        ArrayList list = new ArrayList(hs);
        System.out.println(list.get(3)); // --> retrieve

        //Enhanced for loop - for each
        for(Object x: hs){
            System.out.println(x);
        }

        //Using Iterator
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Clear all the elements
        hs.clear();
        System.out.println(hs);
        System.out.println(hs.isEmpty());


    }
}
