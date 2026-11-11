package RandomPractice;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        int count=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=prev){
                nums[count]=nums[i];
                prev=nums[i];
                count++;
            }
        }
        return count;
    }

    public static void printArray(int[] nums){
         System.out.print("Array: {");
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]);
             if(i<nums.length-1){
                 System.out.print(",");;
             }
         }
         System.out.print("}");
         System.out.println();
    }

    public static void printResult(int[] nums){
        System.out.print("Input ");
        printArray(nums);;
        int res=removeDuplicates(nums);
        System.out.print("Output: "+ res);
        System.out.println();
    }

    public static void main(String[] args){
        int[] nums={1,1,2};
        int[] nums2={0,0,1,1,1,2,2,3,3,4};

        printResult(nums);
        printResult(nums2);
    }
}
