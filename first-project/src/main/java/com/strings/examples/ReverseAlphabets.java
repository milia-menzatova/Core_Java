package com.strings.examples;

public class ReverseAlphabets {
    public static void main(String[] args) {

        String str = "abc123pqr45xyz";
        //Output "zyx123rqpcba"
        int left = 0;
        int right = str.length()-1;
        char ch[] = str.toCharArray(); //convert String into char array

        while(left<right){
            if(Character.isDigit(ch[left])){
                left++;
            }
            else if(Character.isDigit(ch[right])) {
                right--;
            }
            else { //swapping values
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
    }
}
