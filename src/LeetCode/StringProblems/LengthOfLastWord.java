package LeetCode.StringProblems;

public class LengthOfLastWord {
    public int lengthofLastWord(String s){
        String[] words=s.split(" ");
        return words[words.length-1].length();
    }

    public static void prinitResult(String s){
        System.out.println("Input: " + s);
        LengthOfLastWord obj=new LengthOfLastWord();
        System.out.println("The lastword length is: " + obj.lengthofLastWord(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s= "Hello World";
        String s2="   fly me   to   the moon  ";
        String s3= "luffy is still joyboy";

        prinitResult(s);
        prinitResult(s2);
        prinitResult(s3);
    }
}
