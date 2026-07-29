package RandomPractice;

import java.sql.SQLOutput;

public class CharOccurance {
    public int Countoccurance(String s,char ch){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(ch==s.charAt(i))count++;
        }
        return count;
    }

    public static void printResult(String s,char ch){
        System.out.println("Input: " + s);
        System.out.println("char: " + ch);
        CharOccurance obj=new CharOccurance();
        System.out.println("output: " + obj.Countoccurance(s, ch));
        System.out.println();
    }

    public static void main(String[] args) {
        String s="programming";
        char ch='g';

        printResult(s,ch);
    }
}
