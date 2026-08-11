package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class GroupAnagrams{

public HashMap<String, ArrayList<String>> anagram(String[] words){

    HashMap<String,ArrayList<String>> map = new HashMap<>();
     for(int i=0;i<words.length;i++){
         char[] ch=words[i].toCharArray();
         Arrays.sort(ch);
         String key=new String(ch);

         if(!map.containsKey(key)){
             map.put(key,new ArrayList<>());
         }
         map.get(key).add(words[i]);
     }
     return map;
}

public static void printArray(String[] arr){
    System.out.print("Array:");
    System.out.print("{");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        if(i<arr.length-1){
            System.out.print(",");
        }
    }
    System.out.print("}");
    System.out.println();
}

public static void printResult(String[] arr){
    System.out.println("Input ");
    printArray(arr);
    GroupAnagrams obj=new GroupAnagrams();
    System.out.println("Output: " + obj.anagram(arr));
    System.out.println();

}

    public static void main(String[] args) {
        String[] words={"eat","tea","tan","ate","nat","bat"};

        printResult(words);
    }
}