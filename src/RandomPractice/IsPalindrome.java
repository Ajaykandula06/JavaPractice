package RandomPractice;

public class IsPalindrome {
    public boolean isPalindrome(String s){
        s=s.toLowerCase();
        int mid=s.length()/2;
        int n=s.length()-1;
        for(int i=0;i<mid;i++){
            if(s.charAt(i) != s.charAt(n-i)){
                return false;
            }
        }
        return true;
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        IsPalindrome obj=new IsPalindrome();
        System.out.println("Is the String palindrome? " + obj.isPalindrome(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s="madam";
        String s2="hello";

        printResult(s);
        printResult(s2);
    }
}
