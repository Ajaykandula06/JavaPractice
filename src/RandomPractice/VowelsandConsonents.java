package RandomPractice;

import javax.crypto.spec.PSource;
public class VowelsandConsonents {
    public int vowels(String s1){
        s1=s1.toLowerCase();
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e'
                    || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
            || s1.charAt(i) == 'u')count++;
        }
        return count;
    }

    public static void printResult(String s1){

        System.out.println("Input: " + s1);
        VowelsandConsonents obj=new VowelsandConsonents();
        System.out.println("Vowels: " + obj.vowels(s1));
        System.out.println("Consonents: " + (s1.length()- obj.vowels(s1)));
        System.out.println();

    }

    public static void main(String[] args) {
        String s1="hello";
        String s2="education";
        String s3="JAVA";

        printResult(s1);
        printResult(s2);
        printResult(s3);
    }
}
