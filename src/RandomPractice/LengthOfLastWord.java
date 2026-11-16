package RandomPractice;

public class LengthOfLastWord {
    public static int lastword(String s){
        String[] words=s.split(" ");
        return words[words.length-1].length();
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        System.out.println("Output: " + lastword(s));
        System.out.println();

    }

    public static void main(String[] args){
        String sent1="Hello World";
         printResult(sent1);
    }
}
