package RandomPractice;

import java.util.HashMap;

public class FirstUniqChar {
    public int FirstChar(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
          map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1)return i;
        }
        return -1;
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        FirstUniqChar obj=new FirstUniqChar();
        System.out.println("Output: " + obj.FirstChar(s));
        System.out.println();
    }

    public static void main(String[] args){
        String s="leetcode";
        String s1="loveleetcode";
        String s2="aabb";


        printResult(s);
        printResult(s1);
        printResult(s2);
    }
}
