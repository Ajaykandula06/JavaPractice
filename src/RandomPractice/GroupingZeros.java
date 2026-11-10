package RandomPractice;

public class GroupingZeros {
    public static int[] MoveZeros(int[] nums){
        int index=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                 nums[index]=nums[i];
                 index++;
                }
            }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }

    public static void printArray(int[] arr){
        System.out.print("Array: {");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
            System.out.print("}");
            System.out.println();
    }

    public static void printResult(int[] nums){
    System.out.print("Input ");
    printArray(nums);
    System.out.print("Output ");
    GroupingZeros obj=new GroupingZeros();
    int[] result=obj.MoveZeros(nums);
    printArray(result);
    System.out.println();
    }

    public static void main(String[] args){
        int[] arr={0, 1, 0, 3, 12};

        printResult(arr);
    }
}
