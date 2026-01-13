package com.strings.examples;

public class AddingCommasToWordsInSentenceExceptVowels {
    public static void main(String[] args) {
        String str = "I am java programmer";
        String phrase[] = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = 0; i<phrase.length; i++){
            String word = phrase[i];
            result = result.append(word);
            char firstChat = Character.toLowerCase(word.charAt(0));

            if(i>0 && i<phrase.length -1
            && !("aeiou".contains(String.valueOf(firstChat)))
            ){
                result.append(",");
            }
            else{
                result.append(" ");
            }

        }
        System.out.println(result);
    }
}
