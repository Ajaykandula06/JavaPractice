package LeetCode.ArrayProblems;

import java.util.List;

public class CountItem {
    public static int countMatches(List<List<String>> items, String ruleKey,String ruleValue){
        int index=0;
        int count=0;
        if(ruleKey.equals("type")) index=0;
        else if(ruleKey.equals("color")) index=1;
        else if(ruleKey.equals("name")) index=2;

        for(int i=0;i < items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

    public static void printList(List<List<String>> items, String key,String value) {
        System.out.println("Given List: "+ items);
        System.out.println("rulekey: " + key);
        System.out.println("ruleValue: " + value);
    }


public static void printResult(int number){
    System.out.println("Matches: " + number);
}


    public static void main(String[] args) {
        List<List<String>> items =List.of(
                List.of("phone" , "blue" , "Oppo" ),
                List.of("computer" , "silver" ,"lenevo"),
                List.of("phone","black","iphone"));
        String key="type";
        String value="phone";

        printList(items,key,value);
        printResult(countMatches(items,key,value));
    }
}
