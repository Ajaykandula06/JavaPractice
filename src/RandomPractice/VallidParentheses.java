package RandomPractice;

public class VallidParentheses {
    public boolean isValid(String s){
        StringBuilder set=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')set.append(')');
            else if(s.charAt(i)=='{')set.append('}');
            else if(s.charAt(i)=='[')set.append(']');
            else if(set.length()>0 && s.charAt(i) == set.charAt(set.length()-1))set.deleteCharAt(set.length()-1);
            else return false;

            }
        return set.isEmpty();
        }

        public static void printResult(String s){
            System.out.println("Input: " + s);
            VallidParentheses obj=new VallidParentheses();
            System.out.println("Is Parentheses valid? " + obj.isValid(s));
            System.out.println();
        }

    public static void main(String[] args) {
        String s="{[()]}";
        String s2="{[(])}";

        printResult(s);
        printResult(s2);
    }
    }

