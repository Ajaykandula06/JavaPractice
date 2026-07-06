package LeetCode.StringProblems;
public class ToLowerCase {
    public String toLowerCase(String s){
     return s.toLowerCase();
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        ToLowerCase obj=new ToLowerCase();
        System.out.println("Output: " + obj.toLowerCase(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "Hello";
        String s2 = "here";
        String s3 = "LOVELY";

        printResult(s);
        printResult(s2);
        printResult(s3);
    }
}
