package LeetCode;

public class ShuffleArray {
    public int[] shuffle(int[] nums,int n){
        if(nums.length%2 !=0){
            System.out.println("Array must contain Even number of Elements");
            return null;
        }
        int[] arr=new int[nums.length];
        for(int i=0;i < n;i++){
            arr[i*2]=nums[i];
            arr[i*2+1]=nums[n + i];
        }
        return arr;
    }

    public static void printArray(int[] nums){
        System.out.print("Array: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if( i < nums.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void printResult(int[] nums , int n){
        System.out.print("Original ");
        printArray(nums);

        System.out.print("Shuffled ");
        ShuffleArray obj=new ShuffleArray();
        printArray(obj.shuffle(nums,n));
        System.out.println();
    }

    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7,8};int n=nums.length/2;
        int[] nums2 = {2,5,1,3,4,7};int n2 = nums2.length/2;
        int[] nums3 = {1,1,2,2}; int n3 = nums3.length/2;
        int[] nums4 = {1,2,3,4,4,3,2,1};int n4 = nums4.length/2;

        printResult(nums,n);
        printResult(nums2,n2);
        printResult(nums3,n3);
        printResult(nums4,n4);
    }
}
