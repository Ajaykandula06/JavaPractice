package RandomPractice;

import java.util.HashMap;

public class PairsInArray2 {
    public void pairs(int[] arr,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need=target-arr[i];
            if(map.containsKey(need)){
                System.out.println("(" + need + "," + arr[i] + ") ");
            }
            map.put(arr[i],i);
        }
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
        obj.pairs(arr, target);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,2,4};
        int t=5;

        printResult(arr,t);
    }
    }

