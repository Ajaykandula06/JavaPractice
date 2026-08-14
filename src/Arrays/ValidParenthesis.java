package Arrays;

public class ValidParenthesis {
    public boolean isValid(String s){
        if(s.length()%2 !=0)return false;
        StringBuilder ch=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '{')ch.append('}');
                else if(s.charAt(i) == '['){
                    ch.append(']');
            }
                else if(s.charAt(i) == '('){
                    ch.append(')');
            }
                else if (ch.length()==0 || s.charAt(i) != ch.charAt(ch.length()-1)){
                    return false;
            }else{
                    ch.deleteCharAt(ch.length()-1);
            }
        }
        return true;
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        ValidParenthesis obj=new ValidParenthesis();
        System.out.println("Output: " + obj.isValid(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s="([])";
        String s2="([)]";

        printResult(s);
        printResult(s2);
    }
}
