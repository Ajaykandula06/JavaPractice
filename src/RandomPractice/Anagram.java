package RandomPractice;

public class Anagram {
    public boolean checkAnagram(String s1,String s2){
        if(s1.length() != s2.length())return false;
        for(int i=0;i<s1.length();i++){
            int count=s2.indexOf(s1.charAt(i));
            if(count==-1)return false;
            else s2=s2.substring(0,count)+s2.substring(count+1);
        }
        return s2.length()==0;
    }

    public static void printResult(String s1,String s2){
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        Anagram obj=new Anagram();
        if(obj.checkAnagram(s1, s2)){
            System.out.println(obj.checkAnagram(s1, s2) + " Two Strings are Anagrams");
        }else{
            System.out.println(obj.checkAnagram(s1, s2) + " Two Strings are not Anagrams");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        String s3="aab",s4="abb";

        printResult(s1,s2);
        printResult(s3,s4);
    }
}
