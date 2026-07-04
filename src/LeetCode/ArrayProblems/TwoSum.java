package LeetCode.ArrayProblems;

public class TwoSum {
        public static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length - 1;i++){
         for(int j=i+1;j<nums.length;j++) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i,j};
        }
    }
        }
        return new int[]{};
}

public static void printArray(int[] arr){
        System.out.print("Array: ");
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i <arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("} ");
        System.out.println();
    }

    public static void printResult(int[] arr,int target){
        printArray(arr);
        System.out.println("target: " + target);
        System.out.print("Result ");
        int[] result=twoSum(arr,target);
        printArray(result);
        System.out.println();

    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;

        int[] nums2={3,2,4};
        int target2=6;

        int[] nums3={3,3};
        int target3=6;

        printResult(nums,target);
        printResult(nums2,target2);
        printResult(nums3,target3);
    }
}
