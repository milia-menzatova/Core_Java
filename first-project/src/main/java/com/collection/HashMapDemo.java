package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        //Declaration
       // HashMap hm = new HashMap();
       // Map m = new HashMap();
        HashMap<Integer, String> map = new HashMap<>();

        //Adding values into the HashMap - Key, Value pairs
        System.out.println( map.put(101, "Milya"));

        map.put(101, "Test"); //key and value
        map.put(500, "Java");
        map.put(102, null);

        System.out.println(map);

        map.put(101, "Milya");

        System.out.println(map); //replace "Test" will be overridden

        //Size of the hasMap
        System.out.println(map.size());

        //Remove one key value pair
        map.remove(101);
        System.out.println(map);

        //Retriv evalue of an given key

        map.get(500);
        System.out.println(map.get(500));

    }
}
