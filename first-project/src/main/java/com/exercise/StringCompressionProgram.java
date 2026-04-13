package com.exercise;

import java.util.HashMap;
import java.util.Map;

public class StringCompressionProgram {
    public static void main(String[] args) {String str = "aabbbccdddeeeee";
        //output : a2b3c2d3e5
        System.out.println(str);

        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder output = new StringBuilder();

        for(int i =0; i< str.length(); i++){
            if(hm.containsKey(str.charAt(i)))
               hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            else
                hm.put(str.charAt(i),1);
        }
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            output.append(entry.getKey());
            output.append(entry.getValue());
        }
        System.out.println(output);


    }
}
