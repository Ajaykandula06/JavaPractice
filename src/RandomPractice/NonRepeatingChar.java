package RandomPractice;



public class NonRepeatingChar {
    public int nonRepeated(String s){
        int count;
        for(int i=0;i<s.length();i++){
             count=0;
            for(int j=0;j<s.length();j++){
               if(i != j && s.charAt(i)==s.charAt(j)){
                count++;
               }
            }
            if(count == 0)return i;
        }
        return -1;
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        NonRepeatingChar obj=new NonRepeatingChar();
        System.out.println("Output: " + obj.nonRepeated(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s1="leetcode";
        String s2="loveleetcode";
        String s3="programming";
        String s4="aabbcde";

        printResult(s1);
        printResult(s2);
        printResult(s3);
        printResult(s4);
    }
}
