package RandomPractice;

import java.util.ArrayList;

public class StringCompression {
    public String compress(String s){

        StringBuilder result=new StringBuilder();
        int start=0;
        int count=1;
        while(start < s.length()){
            int ss=start+1;
            if(ss<s.length() && s.charAt(start)==s.charAt(ss)){
                count++;
                start++;
            }else{
                result.append(s.charAt(start));
                result.append(count);
                start=ss;
                count=1;
            }
        }
        return result.toString();
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        StringCompression obj=new StringCompression();
        System.out.println("Output: " + obj.compress(s));
        System.out.println();

    }

    public static void main(String[] args) {
        String s="aaabbcdca";
        String s2="abc";
        String s3="aaabbbccca";
        String s4=  "aaa";

        printResult(s);
        printResult(s2);
        printResult(s3);
        printResult(s4);
    }
}
