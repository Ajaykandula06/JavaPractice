package RandomPractice;

import java.util.HashMap;

public class NRC {
    public String first(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int j = 0; j < s.length(); j++) {
            if(map.get(s.charAt(j))==1){
                return String.valueOf(s.charAt(j));

            }
                }

            return "NOTFOUND";
        }


    public static void printResult(String s) {
        System.out.println("Input: " + s);
        NRC obj = new NRC();
        System.out.println("Output: " + obj.first(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s="leetcode";
        String s2="aabb";

        printResult(s);
        printResult(s2);
    }
}
