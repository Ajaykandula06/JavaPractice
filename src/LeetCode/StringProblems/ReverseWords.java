package LeetCode.StringProblems;

public class ReverseWords {
    public String reverseWords(String s){
       String[] words=s.split(" ");
       for(int i=0;i< words.length;i++){
           String rev = "";
           for(int j=words[i].length()-1;j>=0;j--){
               rev += words[i].charAt(j);
           }
           words[i]=rev;
       }
       return String.join(" ",words);
    }

    public static void printResult(String s){
        System.out.println("Input String: " + s);
        ReverseWords obj=new ReverseWords();
        System.out.println("Output String: " + obj.reverseWords(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s= "Let's take LeetCode contest";
        String s2= "Mr Ding";

        printResult(s);
        printResult(s2);
    }
}
