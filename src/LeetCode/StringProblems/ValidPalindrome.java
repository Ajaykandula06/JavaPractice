package LeetCode.StringProblems;

public class ValidPalindrome {
    public boolean  validPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
                if (s.charAt(left) == s.charAt(right)) {
                    right--;
                    left++;
                } else if (s.charAt(left) != s.charAt(right)) {
                    int index = right;
                    s = s.substring(0, index) + s.substring(index + 1);
                    break;
                }
            }
        System.out.println(s);
        boolean checkright=checkPalindrome(s);
        s=s.substring(0,left)+s.substring(left+1);
        System.out.println(s);
        boolean checkleft=checkPalindrome(s);
        return checkleft||checkright;
        }

        public static boolean checkPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) == s.charAt(right)) {
                    right--;
                    left++;
                } else {
                    return false;
                }
            }return true;
        }


    public static void printResult(String s){
        System.out.println("Input: "+ s);
        ValidPalindrome obj=new ValidPalindrome();
        if(obj.validPalindrome(s)){
            System.out.println(obj.validPalindrome(s)+", it is a Palindrome");
        }else{
            System.out.println(obj.validPalindrome(s)+", it is not a Palindrome");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "aba";
        String s2 = "abca";
        String s3= "abc";

        printResult(s);
        printResult(s2);
        printResult(s3);

    }
}
