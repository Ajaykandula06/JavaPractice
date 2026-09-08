package RandomPractice;

import java.util.HashMap;

public class KdistinctSubstring {
    public String longest(String word,int k){
      int maxlength=0;
      int left=0,start=0;
      HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<word.length();i++){
          int right=i;
          map.put(word.charAt(right),map.getOrDefault(word.charAt(right),0)+1);
          while(map.size()>k){
              char ch=word.charAt(left);
              map.put(ch,map.get(ch)-1);
              if(map.get(ch)==0)map.remove(ch);
              left++;

          }
          int currentlength=right-left+1;
          if(currentlength>maxlength){
              maxlength=currentlength;
              start=left;
          }
       }
       return word.substring(start,start+maxlength);
    }

    public static void printResult(String word,int k){
        System.out.print("Input: " + word);
        System.out.println(", K: " + k);
        KdistinctSubstring obj=new KdistinctSubstring();
        String result=obj.longest(word, k);
        System.out.print("Output: " + result.length());
        System.out.println(", (" + result + ")");
        System.out.println();

    }

    public static void main(String[] args) {
        String word="eceba";
        int k=2;

        printResult(word,k);
    }
}
