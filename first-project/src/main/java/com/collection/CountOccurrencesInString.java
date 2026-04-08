package com.collection;

import java.util.HashMap;

public class CountOccurrencesInString {
    public static void getOccurrences(String str){

        HashMap<Character, Integer> map = new HashMap<>();
        char chArray[] = str.toCharArray();
        for(char c:chArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
               map.put(c, 1);
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
