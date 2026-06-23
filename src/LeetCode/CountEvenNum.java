package LeetCode;

public class CountEvenNum {
    public static int findEvenNum(int[] nums){
        int numCount = 0;
        for(int i=0;i < nums.length;i++){
            int digitCount = 0;
            int temp = nums[i];
            for(;temp > 0;temp /= 10){
                digitCount++;
            }
            if(digitCount % 2 ==0) numCount++;
        }
        return numCount;
    }

    public static void printArray(int[] nums){
        System.out.print("Array: ");
        for(int i=0;i < nums.length;i++){
            System.out.print(nums[i]);
            if(i < nums.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }


    public static void printResult(int[] arr){
        printArray(arr);
        int num = findEvenNum(arr);
        System.out.println("EvenNumber digits in the given Array are: " + num);
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int[]   nums2 = {555,901,482,1771};

        printResult(nums);
        System.out.println();
        printResult(nums2);
    }
}
