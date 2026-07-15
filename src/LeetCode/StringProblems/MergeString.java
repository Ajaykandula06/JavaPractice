package LeetCode.StringProblems;

public class MergeString {
    public String mergeAlternately(String word1,String word2){
        int i=0;
        StringBuilder result=new StringBuilder();
        while(i < word1.length() && i < word2.length()){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }
        if(i==word1.length()){
            result.append(word2.substring(i));
        }else {
            result.append(word1.substring(i));
        }
        return result.toString();
    }

    public static void printResult(String word1,String word2){
        System.out.println("word1: " + word1);
        System.out.println("word2: " + word2);
        MergeString obj=new MergeString();
        System.out.println("MergedString: " + obj.mergeAlternately(word1,word2));
        System.out.println();
    }

    public static void main(String[] args) {
        String word1= "abc", word2 = "pqr";
        String word3="ab", word4 = "pqrs";
        String word5="abcd", word6 = "pq";

        printResult(word1,word2);
        printResult(word3,word4);
        printResult(word5,word6);
    }
}
