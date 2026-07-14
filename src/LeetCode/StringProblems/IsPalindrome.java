package LeetCode.StringProblems;

public class IsPalindrome {
    public boolean ispalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left))
                    != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void printResult(String s){
        System.out.println("Input String: "+s);
        IsPalindrome obj=new IsPalindrome();
        if(obj.ispalindrome(s)){
            System.out.println(obj.ispalindrome(s) + ", it can be a Palindrome");
        }else {
            System.out.println(obj.ispalindrome(s) + ", it can not be a Palindrome");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        String s2="Race a Car";
        printResult(s);
        printResult(s2);
    }
}
