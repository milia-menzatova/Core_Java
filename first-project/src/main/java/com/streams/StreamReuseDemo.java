package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamReuseDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Milya", "Amira", "Melek");
        Stream<String> st = names.stream();
        //st.sorted(); //will show error, we cannot reuse st aga,need use chaining method
        st.forEach(n-> System.out.println(n));
    }
}
