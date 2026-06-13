package Strings;

import java.util.*;
public class palindrome {
    public static boolean checkPalindrome(String str){
        int n=str.length();
        for(int i=0;i < n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void printResult(boolean str) {
        if (str) {
            System.out.println("Given string is a Palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }
    }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str=sc.nextLine();

            printResult(checkPalindrome(str));
        }

}
