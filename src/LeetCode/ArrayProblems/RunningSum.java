package LeetCode.ArrayProblems;

public class RunningSum {
    public int[] sumArray(int[] nums){
        int[] arr = new int[nums.length];
        int sum=0;
        for(int i=0;i < nums.length;i++){
             sum += nums[i];
            arr[i] = sum;
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

    public static void printResult(int[] nums){
        System.out.print("Original");
        printArray(nums);
        System.out.print("Sum ");
        RunningSum obj=new RunningSum();
        printArray(obj.sumArray(nums));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] nums2={1,1,1,1,1};
        int[] nums3={3,1,2,10,1};

       printResult(nums);
       printResult(nums2);
       printResult(nums3);


    }

}
