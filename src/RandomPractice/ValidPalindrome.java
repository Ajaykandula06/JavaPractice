package RandomPractice;

public class ValidPalindrome {
    public boolean isValid(String s){
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))return false;
        }
        return true;
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        ValidPalindrome obj=new ValidPalindrome();
        System.out.println("is the Palindrome is Valid?? " + obj.isValid(s));
        System.out.println();
    }

    public static void main(String[] args){
        String s="A man, a plan, a canal: Panama";
        String s2="race a car";

        printResult(s);
        printResult(s2);
    }
}
