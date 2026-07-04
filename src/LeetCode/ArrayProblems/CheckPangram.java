package LeetCode.ArrayProblems;

public class CheckPangram {
    public static boolean pangram(String sentence){
        String letters="abcdefghijklmnopqrstuvwxyz";
        sentence=sentence.toLowerCase();
       if(sentence.length() < letters.length()) return false;
       for(int i=0;i < letters.length();i++){
           char ch=letters.charAt(i);
           if(sentence.indexOf(ch) == -1) return false;
       }
       return true;
    }

    public static void printResult(String sentence){
        System.out.println("Sentence: " + sentence);
        if(pangram(sentence)){
            System.out.println("Given Sentence is Pangram");
        }else{
            System.out.println("given Sentence is not a Pangram");
        }
    }

    public static void main(String[] args) {
        String sentence = "thequ ickbro wnf oxjumpso  verthelazydog";
        String name="Ajay";

        printResult(sentence);
        System.out.println();

        printResult(name);

    }
}
