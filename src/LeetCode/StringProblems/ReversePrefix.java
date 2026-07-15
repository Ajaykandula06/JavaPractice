package LeetCode.StringProblems;

public class ReversePrefix {
    public String reversePrefix(String word,char ch){
        int i=word.indexOf(ch);
        if(i==-1)return word;
        StringBuilder result=new StringBuilder();
        result.append(word.substring(0,i+1));
        result.reverse();
        result.append(word.substring(i+1));
        return result.toString();
    }

    public static void printResult(String word,char ch){
        System.out.println("word: " + word);
        System.out.println("Char: " + ch);
        ReversePrefix obj=new ReversePrefix();
        System.out.println("Output: " + obj.reversePrefix(word, ch));
        System.out.println();
    }

    public static void main(String[] args) {
        String word = "abcdefd"; char ch = 'd';
        String word2 = "xyxzxe"; char ch2 = 'z';
        String word3 = "abcd"; char ch3 = 'z';

        printResult(word,ch);
        printResult(word2,ch2);
        printResult(word3,ch3);

    }
}
