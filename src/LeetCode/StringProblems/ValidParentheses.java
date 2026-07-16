package LeetCode.StringProblems;

public class ValidParentheses {
    public boolean isValid(String s){
        if(s.length()%2 != 0)return false;
       char lastOpened='0';
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '(' || '[' || '{' ){
                lastOpened =s.charAt(i);
            }
        }
    }
}
