package RandomPractice;



public class LargestSubString {
    public int largest(String s){
        String sub;
        int max=0;
        for(int i=0;i<s.length()-1;i++){
             sub="" +s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(sub.indexOf(s.charAt(j)) == -1){
                    sub += s.charAt(j);
                }else{
                    break;
                }
            }
            max=Math.max(max,sub.length());
        }
        return max;
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        LargestSubString obj=new LargestSubString();
        System.out.println("Output: " + obj.largest(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        String s2="bbbbb";
        String s3="pwwkew";

        printResult(s);
        printResult(s2);
        printResult(s3);
    }
}
