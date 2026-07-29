package RandomPractice;

import java.util.Arrays;
public class Anagram2 {
    public boolean checkAnagram(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

    public static void printResult(String s1,String s2){
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        Anagram obj=new Anagram();
        if(obj.checkAnagram(s1, s2)){
            System.out.println(obj.checkAnagram(s1, s2) + " Two Strings are Anagrams");
        }else{
            System.out.println(obj.checkAnagram(s1, s2) + " Two Strings are not Anagrams");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        String s3="aab",s4="abb";

        printResult(s1,s2);
        printResult(s3,s4);
    }
}


