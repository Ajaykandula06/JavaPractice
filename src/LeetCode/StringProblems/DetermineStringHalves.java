package LeetCode.StringProblems;
public class DetermineStringHalves {
    public boolean halvesAlike(String s){
        s=s.toLowerCase();
        int mid=s.length()/2;
       int firstCount=0,secondCount=0;
       for(int i=0;i<mid;i++){
        if(isVowel(s.charAt(i)))firstCount++;
        if(isVowel(s.charAt(mid+i)))secondCount++;
       }
       return firstCount==secondCount;
    }

    public static boolean isVowel(char c){
        return "aeiou".indexOf(c) != -1;
    }

    public static void printResult(String s){
        System.out.println("Input: " + s);
        DetermineStringHalves obj=new DetermineStringHalves();
        if(obj.halvesAlike(s)){
            System.out.println("True, the Halves are Alike");
        }else{
            System.out.println("False, the Halves are not Alike");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s1="book";
        String s2="textbook";
        String s3="" +
                "";

        printResult(s1);
        printResult(s2);
        printResult(s3);
    }
}
