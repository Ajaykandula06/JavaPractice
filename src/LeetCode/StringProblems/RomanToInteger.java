package LeetCode.StringProblems;

public class RomanToInteger {
    public int romanToInt(String s){
        int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        int result=0;
        for(int i=0;i<s.length()-1;i++){
            int current=s.charAt(i);
            int nextValue=s.charAt(i+1);
            if(current>=nextValue) result += current;
            else if(current < nextValue) result += nextValue-current;
        }
        return result;
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        RomanToInteger obj=new RomanToInteger();
        System.out.println("Converted num: " + obj.romanToInt(s));
    }

    public static void main(String[] args) {
        String s = "III";

        printResult(s);
    }
}
