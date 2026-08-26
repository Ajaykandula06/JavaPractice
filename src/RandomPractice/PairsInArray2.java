package RandomPractice;

import java.util.HashMap;

public class PairsInArray2 {
    public HashMap<Integer,Integer> pairs(int[] arr,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int remian=target-arr[i];
            if(map.containsKey(remian)){
                map.put(arr[i],target);
            }
            map.put(arr[i],i);
        }
        return map;
    }
    public static void printArray(int[] arr){
        System.out.print("Array: ");
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

    public static void printResult(int[] arr,int target){
        System.out.print("Input: ");
        printArray(arr);
        System.out.println("Target: " + target);
        PairsInArrayB obj=new PairsInArrayB();
        System.out.print("pairs: ");
        obj.pairs(arr, target);
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,2,4};int t=5;
        int[] arr2={2, 7, 11, 15};int t2=9;

        printResult(arr,t);
        printResult(arr2,t2);
    }
    }

