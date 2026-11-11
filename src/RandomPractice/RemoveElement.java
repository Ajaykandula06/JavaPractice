package RandomPractice;

public class RemoveElement {
    public int remain(int[] nums,int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
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
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(int[] arr,int val){
        System.out.print("Input ");
        printArray(arr);
        System.out.println("Val: " + val);
        RemoveElement obj=new RemoveElement();
        System.out.println("Output: " + obj.remain(arr, val));
        System.out.println();

    }

    public static void main(String[] args){
        int[] arr={3,2,2,3};int val=3;
        int[] arr2={0, 1, 2, 2, 3, 0, 4, 2};int val2=2;

        printResult(arr,val);
        printResult(arr2,val2);
    }
}
