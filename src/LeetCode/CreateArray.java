package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CreateArray {
    public static int[] create(int[] nums,int[] index){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i < nums.length;i++){
            list.add(index[i], nums[i]);
        }
        int[] result=new int[list.size()];
        for(int i=0;i < list.size();i++){
            result[i] = list.get(i);
        }
        return result;
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

    public static void printResult(int[] nums,int[] index){

        int[] result=create(nums,index);
        System.out.print("Nums ");
        printArray(nums);
        System.out.print("Index ");
        printArray(index);
        System.out.print("Result ");
        printArray(result);

    }

    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};

        int[] nums2 = {1,2,3,4,0};
        int[] index2 = {0,1,2,3,0};

        int[] nums3 = {1};
        int[] index3 = {0};

        printResult(nums,index);
        System.out.println();

        printResult(nums2,index2);
        System.out.println();

        printResult(nums3,index3);
    }
}
