package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediaStreamOperationsDemo {
    public static void main(String[] args) {

        //Filter() - based on condition - keep only matching elements
        List<Integer> num1 = Arrays.asList(10, 20, 30, 40, 50);
        Stream<Integer> st1 = num1.stream().filter(n-> n%20==0);
       // st1.forEach(n-> System.out.println(n));


        //Map(Function) - Transform each element, transform to another stream
        List<String> names = Arrays.asList("Milya", "Test", "Tom");
        Stream<Integer> namesLength = names.stream().map(n->n.length());
       // namesLength.forEach(n-> System.out.println(n));

        //Distinct() - remove duplicates
        List<Integer> num2 = Arrays.asList(1,1,1,1,1,5,7,7, 88);
        Stream<Integer>str3 = num2.stream().distinct();
        //str3.forEach(n-> System.out.println(n));


        //Sorted() - Sort natural order (Ascending)
        List<Integer> nums4 = Arrays.asList(60, 90, 56, 3, 2, 89);
        Stream<Integer> sortedNumbers = nums4.stream().sorted();
        //sortedNumbers.forEach(n-> System.out.println(n));

        //Sorted(Comparator) - Custom sorting (Descending)
        List<Integer> nums5 = Arrays.asList(60, 90, 56, 3, 2, 89);
        Stream<Integer> Numbers = nums5.stream().sorted((a,b)->b-a);
       // Numbers.forEach(n-> System.out.println(n));

        //Limit(n) - Take first n elements
        List<Integer> nums6 = Arrays.asList(172, 787, 8, 6, 4, 89, 54);
        Stream<Integer> firstFive = nums6.stream().limit(5);
        //firstFive.forEach(n-> System.out.println(n));

        //Skip(n)-Skip first n elements
        List<Integer> nums7 = Arrays.asList(172, 787, 8, 6, 4, 89, 54);
        Stream<Integer> skipValues = nums7.stream().skip(2);
        skipValues.forEach(n-> System.out.println(n));





    }
}
