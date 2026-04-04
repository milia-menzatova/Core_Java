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
        map.put(77, "Flower");
        map.put(34,"100");

        System.out.println(map);

        map.put(101, "Milya");

        System.out.println(map); //replace "Test" will be overridden

        //Size of the hasMap
        System.out.println(map.size());

        //Remove one key value pair
        map.remove(101);
        System.out.println(map);

        //Retrieve evalue of  given key

        map.get(500);
        System.out.println(map.get(500));

        //Retrieve all the keys and values from the Hashmap
        map.keySet();
        map.values();
        map.entrySet(); // will return both key and value

        System.out.println("-------------------");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

    }
}
