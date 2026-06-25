package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class AddFormArray {
    public static List<Integer> addtoFormArray(int[] num, int k){
        List<Integer> nums = new ArrayList<>();
        int sum = 0;
    for(int i=0;i<num.length;i++){
        sum = sum * 10 + num[i];
    }
    sum += k;
    while(sum > 0){
        int lastdigit = sum % 10;
        nums.add(0,lastdigit);
        sum/=10;
    }
    return nums;

    }
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void printResult(int[] arr,int k){
        printArray(arr);
        System.out.println("Given number: " + k);
        System.out.print("Created Array: ");
        List<Integer>nums =addtoFormArray(arr, k);
        System.out.println(nums);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int k=200;

        printResult(nums,k);
    }
}
