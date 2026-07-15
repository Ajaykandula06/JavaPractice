package LeetCode.StringProblems;

public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence,String word){
        if(!sequence.contains(word))return  0;
        int k=0;
        String repeated=word;
        while(sequence.contains(repeated)){
            k++;
            repeated += word;
        }
        return k;
    }

    public static void printResult(String sequence,String word){
        System.out.println("Sequence: " + sequence);
        System.out.println("Word: " + word);
        MaximumRepeatingSubstring obj=new MaximumRepeatingSubstring();
        System.out.println("Output: " + obj.maxRepeating(sequence,word));
        System.out.println();
    }

    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";

        String sequence2 = "ababc";
        String word2 = "ba";

        String sequence3 = "ababc";
        String word3 = "ac";

        printResult(sequence,word);
        printResult(sequence2,word2);
        printResult(sequence3,word3);
    }
}
