package LeetCode.StringProblems;

public class FirstOccuranceInString {
    public int strStr(String haystack,String needle){
       return haystack.indexOf(needle);
    }

    public static void printResult(String haystack,String needle){
        System.out.println("Given Haystack: "+ haystack);
        System.out.println("Given needle: " + needle);
        FirstOccuranceInString obj=new FirstOccuranceInString();
        int result= obj.strStr(haystack,needle);
        if(result!=-1){
            System.out.println(needle+" occurs at index "+result);
        }else{
            System.out.println(needle+" did not occur in "+ haystack);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String  haystack = "sadbutsad";
        String needle = "sad";

        String  haystack2 = "leetcode";
        String needle2 = "leeto";

        printResult(haystack,needle);
        printResult(haystack2,needle2);
    }
}
