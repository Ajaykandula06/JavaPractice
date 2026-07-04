package LeetCode.ArrayProblems;

public class SmallerThanCurrent {
    public static int[] smaller(int[] nums){
        int[] arr=new int[nums.length];
        for(int i=0;i < nums.length;i++){
            int small=0;
            for(int j=0;j < nums.length;j++){
                if( nums[i] > nums[j] ){
                    small++;
                }
            }
            arr[i] = small;
        }
        return arr;
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

    public static void printResult(int[] arr){

        System.out.print("Original ");
        printArray(arr);
        System.out.print("Result ");
        printArray(smaller(arr));
        System.out.println();

    }

    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] nums2={6,5,4,8};
        int[] nums3={7,7,7,7};
        int[] nums4={1,2,3,4,5};


        printResult(nums);
        printResult(nums2);
        printResult(nums3);
        printResult(nums4);
    }
}
