package LeetCode.StringProblems;

public class DecryptString {
    public String freqAlphabets(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            if(i+2 < s.length() && s.charAt(i+2) == '#'){
                int num= (s.charAt(i) - '0')*10 + (s.charAt(i+1) - '0');
                char ch= (char) ('a' + num -1);
                result += ch;
                i+=2;
            }else {
                int num = s.charAt(i) - '0';
                char ch = (char) ('a' + num - 1);
                result += ch;
            }

        }
        return result;

    }

    public static void printResult(String s){
        System.out.println("Input String: " + s);
        DecryptString obj=new DecryptString();
        System.out.println("Output String: " + obj.freqAlphabets(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String  s = "10#11#12";
        String s2="1326#";

        printResult(s);
        printResult(s2);
    }
}
