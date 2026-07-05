package LeetCode.StringProblems;

public class SortingSentence {
    public String sortSentence(String s){
        String[] words=s.split(" ");
        String[] result=new String[words.length];
    for(int i=0;i< words.length;i++){
        int index=words[i].charAt(words[i].length()-1) - '0';
       result[index-1]=words[i].substring(0,words[i].length()-1);
        }
    return String.join(" ",result);
    }

    public static void printResult(String s){
        System.out.println("Input String: " + s);
        SortingSentence obj=new SortingSentence();
        System.out.println("Output String: " + obj.sortSentence(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String sentence = "is2 sentence4 This1 a3";
        String sentence2 = "Myself2 Me1 I4 and3";

        printResult(sentence);
        printResult(sentence2);
    }
}
