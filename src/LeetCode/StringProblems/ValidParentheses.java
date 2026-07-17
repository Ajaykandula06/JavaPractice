package LeetCode.StringProblems;

public class ValidParentheses{
    public boolean isValid(String s){
        if(s.length()%2 != 0)return false;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                result.append(')');
            }else if(s.charAt(i)=='['){
                result.append(']');
            }else if(s.charAt(i)=='{'){
                result.append('}');
            }else if(result.length()>0 && s.charAt(i)== result.charAt(result.length()-1)){
                result.deleteCharAt(result.length()-1) ;
            }else{
                return false;
            }
        }
        return result.length()==0 ;
    }


    public static void printResult(String s){
        System.out.println("Input: " + s);
        ValidParentheses obj=new ValidParentheses();
        if(obj.isValid(s)){
            System.out.println(obj.isValid(s) + " it can be a ValidParentheses");
        }else{
            System.out.println(obj.isValid(s) + " it can not be a ValidParenthese");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s= "()";
        String s2= "()[]{}";
        String s3=  "(]";
        String s4="([])";
        String s5="([)]";

        printResult(s);
        printResult(s2);
        printResult(s3);
        printResult(s4);
        printResult(s5);
    }
}
