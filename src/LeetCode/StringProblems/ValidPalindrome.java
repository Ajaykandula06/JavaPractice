package LeetCode.StringProblems;

public class ValidPalindrome {
    public boolean  validPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        boolean checkright;
        boolean checkleft;
        while (left < right) {
            if(s.charAt(left) == s.charAt(right)){
                right--;
                left++;
        }else{
                 checkright=checkPalindrome(s,left+1,right);
                 checkleft=checkPalindrome(s,left,right-1);
                return checkleft || checkright;
            }
        }
        return true;


        }

        public static boolean checkPalindrome(String s,int l,int r) {
            int left = l;
            int right = r;
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
