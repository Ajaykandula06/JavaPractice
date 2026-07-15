package LeetCode.StringProblems;

public class CheckOneSegmentOfOnes {
    public boolean checkOneSegment(String s){
       return !s.contains("01");
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        CheckOneSegmentOfOnes obj=new CheckOneSegmentOfOnes();
        System.out.println("Output: " + obj.checkOneSegment(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "1001";
        String s2 = "110";

        printResult(s);
        printResult(s2);
    }
}
