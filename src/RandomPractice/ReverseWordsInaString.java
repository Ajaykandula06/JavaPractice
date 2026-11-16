package RandomPractice;

import java.util.Arrays;

public class ReverseWordsInaString {
    public static String reverseString(String s){
        String[] words=s.split(" ");
        for(int i=0;i< words.length/2;i++){
            String temp=words[i];
            words[i]=words[words.length-1-i];
            words[words.length-1-i]=temp;
        }

        return String.join(" ",words);
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        System.out.println("Output: " + reverseString(s));
        System.out.println();
    }

    public static void main(String[] args){
        String s="the sky is blue";

        printResult(s);
    }


}
