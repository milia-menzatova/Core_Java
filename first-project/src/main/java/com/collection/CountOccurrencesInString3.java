package com.collection;

import java.util.HashMap;

//Count only spaces
public class CountOccurrencesInString3 {
    public static void getOccurrences(String str){

        HashMap<Character, Integer> map = new HashMap<>();
        char chArray[] = str.toCharArray();
        for(char c:chArray) {
            if (String.valueOf(c).isBlank()) {

                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        System.out.println(str+" : "+map);

    }

    public static void main(String[] args) {
        String str = "aaabbccccddd";
        getOccurrences("aaabbccccddd");
        getOccurrences("test");
        getOccurrences("   Milya");

    }
}
