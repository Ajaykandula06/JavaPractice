package RandomPractice;

public class SquareOfSortedArray2 {
    public static int[] squareArray(int[] nums){
        int n=nums.length;
        int[] result=new int[n];

        int left=0;
        int right=n-1;
        int position=n-1;

        while(left<=right){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];

            if(left > right){
                nums[position]=leftSquare;
                left++;
            }else{
                nums[position]=rightSquare;
                right--;
            }
            position--;
        }
        return nums;
    }

    public static void printArray(int[] nums){
        System.out.print("Array: {");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i<nums.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(int[] nums){
        System.out.print("Input ");
        printArray(nums);
        SquareOfSortedArray2 obj=new SquareOfSortedArray2();
        int[] res=obj.squareArray(nums);
        System.out.print("Output ");
        printArray(nums);
        System.out.println();

    }

    public static void main(String[] args){
        int[] nums={-4, -1, 0, 3, 10};
        int[] nums2={-7,-3,2,3,11};

        printResult(nums);
        printResult(nums2);
    }
}
