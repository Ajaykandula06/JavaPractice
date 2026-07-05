package LeetCode.StringProblems;

public class ShuffleString {
    public String restoreString(String s,int[] indices){
        char[] result=new char[s.length()];
        for(int i=0;i<s.length();i++){
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

    public static void printResult(String s,int[] indices){
        System.out.println("Input String: " + s);
        ShuffleString obj=new ShuffleString();
        String output=obj.restoreString(s,indices);
        System.out.println("Output String: "+output);
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        String s2="abc";
        int[] indices2={0,1,2};

        printResult(s,indices);
        printResult(s2,indices2);
    }
}
