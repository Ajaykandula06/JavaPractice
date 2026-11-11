package RandomPractice;

public class SquareOftheSortedArray {
    public int[] squareArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=(nums[i]*nums[i]);
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
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

    public static void printResult(int[] arr){
        System.out.print("Input ");
        printArray(arr);
        SquareOftheSortedArray obj=new SquareOftheSortedArray();
        int[] res=obj.squareArray(arr);
        System.out.print("Output ");
        printArray(res);
        System.out.println();

    }

    public static void main(String[] args){
        int[] arr={-4,-1,0,3,10};
        int[] arr2={-7,-3,2,3,11};

        printResult(arr);
        printResult(arr2);
    }
}
