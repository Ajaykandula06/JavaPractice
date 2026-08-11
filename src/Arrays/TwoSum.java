package Arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] indice(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
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
        System.out.print("Input ");
        printArray(arr);
        System.out.println("target: " + target);
        TwoSum obj=new TwoSum();
        int[] result=obj.indice(arr, target);
        if(result[0] == -1){
            System.out.println("There is no TargetSum in given array");
        }else{
            System.out.println("Output: " + result[0] + "," + result[1]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};int t=9;
        int[] arr2={3,2,4};int t1=6;
        int[] arr3={3,3};int t3=6;

        printResult(arr,t);
        printResult(arr2,t1);
        printResult(arr3,t3);

    }
}
