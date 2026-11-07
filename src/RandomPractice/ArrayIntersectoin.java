package RandomPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayIntersectoin {
    public int[] Intersection(int[] nums,int[] nums2){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void printArray(int[] arr){
        System.out.print("Array: {");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(int[] arr,int[] arr2){
        System.out.print("Input ");
        printArray(arr);
        System.out.print("Input ");
        printArray(arr2);
        ArrayIntersectoin obj=new ArrayIntersectoin();
        int[] result=obj.Intersection(arr,arr2);
        System.out.print("Output: ");
        printArray(result);
        System.out.println();



    }

    public static void main(String[] args){
        int[] nums={1,2,2,1},nums2={2,2};
        int[] nums3={4,9,5},nums4={9,4,9,8,4};

        printResult(nums,nums2);
        printResult(nums3,nums4);
    }
}
