package LeetCode.StringProblems;

public class NumberOfStrings {
    public int numOfStrings(String[] pattern,String word) {
        int count = 0;
        for (int i = 0; i < pattern.length; i++) {
            if(word.contains(pattern[i]))count++;
        }
        return count;
    }

    public static void printArray(String[] pattern){
        System.out.print("Array: ");
        System.out.print("{");
        for(int i=0;i<pattern.length;i++){
            System.out.print( pattern[i]);
            if(i<pattern.length-1){
                System.out.print(",");
            }
        }
        System.out.print("} ");
        System.out.println();
    }

    public static void printResult(String[] pattern,String word){
        System.out.print("Input ");
        printArray(pattern);
        System.out.println("Word: "+word );
        NumberOfStrings obj=new NumberOfStrings();
        System.out.println("Substrings present in the word: " + obj.numOfStrings(pattern,word));
        System.out.println();

    }

    public static void main(String[] args) {
        String[]  patterns = {"a","abc","bc","d"};
        String word="abc";

        String[] pattern2={"a","b","c"};
        String word2="aaaaabbbbb";

        String[] pattern3={"a","a","a"};
        String word3="ab";

        printResult(patterns,word);
        printResult(pattern2,word2);
        printResult(pattern3,word3);
    }
}
