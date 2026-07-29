package RandomPractice;

public class RemoveDuplicate {
    public String remove(String s){
        for(int i=0;i<s.length()-1;i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    s = s.substring(0,j)+s.substring(j+1);
                    j--;
                }
            }
        }
        s=s.trim();
        return s;
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        RemoveDuplicate obj=new RemoveDuplicate();
        System.out.println("Output: " + obj.remove(s));
        System.out.println();
    }

    public static void main(String[] args) {
        String s="programming";
        String s2="banana";

        printResult(s);
        printResult(s2);
    }
}
