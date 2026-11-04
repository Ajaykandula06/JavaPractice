package RandomPractice;

public class TwoSumWithSortedArray {
    public int[] TwoSum(int[] numbers,int target){
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[right]+numbers[left];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void printArray(int[] arr){
        System.out.print("Array: {");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(int[] numbers,int target){
        System.out.print("Input ");
        printArray(numbers);
        System.out.println("Target: " + target);
        TwoSumWithSortedArray obj= new TwoSumWithSortedArray();
        int[] result=obj.TwoSum(numbers,target);
        System.out.print("Output ");
        printArray(result);
        System.out.println();

    }
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int t=9;

        int[] nums1={2,3,4};
        int t1=6;

        int[] nums2={-1,0};
        int t2=-1;

        printResult(nums1,t1);
        printResult(nums2,t2);
        printResult(nums,t);

    }
}
