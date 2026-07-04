package LeetCode.ArrayProblems;

public class BuildArray {
    public static int[] build(int[] nums){
        int[] arr=new int[nums.length];
        for(int i = 0; i<arr.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.print("Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums={5,0,1,2,3,4};
        int[] nums2={0,2,1,5,3,4};

        System.out.print("Original ");
        printArray(nums);
        System.out.print("builted ");
        printArray(build(nums));
        System.out.println();

        System.out.print("Original");
        printArray(nums2);
        System.out.print("builted ");
        printArray(build(nums2));

    }
}
