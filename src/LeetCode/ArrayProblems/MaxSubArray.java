package LeetCode.ArrayProblems;
public class MaxSubArray {
    public int max(int[]arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++) {
            int curr=0;
            for (int j = i; j < arr.length; j++) {
                 curr += arr[j];
                if (curr > max)max = curr;
            }
        }
        return max;
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
        System.out.print("} ");
        System.out.println();
    }

    public static void printResult(int[] arr){
        printArray(arr);
        MaxSubArray obj=new MaxSubArray();
        System.out.println("Max Sub Array in the given Array: " + obj.max(arr));
        System.out.println();

    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2={5,4,-1,7,8};
        int[] nums3={1,3,4};
        int[] nums4={1};

        printResult(nums);
        printResult(nums2);
       printResult(nums3);
        printResult(nums4);



    }
}
