package LeetCode.StringProblems;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length()-1; i++) {
            int current=getvalue(s.charAt(i));
            int nextvalue=getvalue(s.charAt(i + 1));
            if(current < nextvalue){
                result -= current;
            }else{
                result += current;
            }

        }
        result += getvalue(s.charAt(s.length()-1));
        return result;
    }

    public static int getvalue(char c){
        if(c=='I')return 1;
        if(c=='V')return 5;
        if(c=='X')return 10;
        if(c=='L')return 50;
        if(c=='C')return 100;
        if(c=='D')return 500;
        return 1000;


    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        RomanToInteger obj=new RomanToInteger();
        System.out.println("Converted num: " + obj.romanToInt(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "IIIII";
        String s2= "LVIII";
        String s3= "MCMXCIV";

        printResult(s);
        printResult(s2);
        printResult(s3);
    }
}
