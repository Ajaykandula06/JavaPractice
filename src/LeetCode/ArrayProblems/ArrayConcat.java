package LeetCode.ArrayProblems;

public class ArrayConcat {
    public static int[] concatenation(int[] nums){
        int[] arr=new int[nums.length * 2];
        for(int i=0;i< nums.length;i++){
            arr[i]=nums[i];
            arr[nums.length + i] = nums[i];
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

    public static void main(String[] args) {
        int[] arr={1,3,2,1};
        int[] arr2={1,2,1};

        System.out.print("Original ");
        printArray(arr);
        System.out.print("Concat ");
        printArray(concatenation(arr));
        System.out.println();

        System.out.print("Original ");
        printArray(arr2);
        System.out.print("Concat ");
        printArray(concatenation(arr2));
    }
}
