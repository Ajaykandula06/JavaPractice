package Arrays;

public class MaxSubArraySum {
    public int maxSum(int[] arr){
        int current=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            current=Math.max(arr[i],current+arr[i]);
           max=Math.max(max,current);
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
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(int[] arr){
        System.out.print("Input ");
        printArray(arr);
        MaxSubArraySum obj=new MaxSubArraySum();
        System.out.println("Max: " + obj.maxSum(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2={5,4,-1,7,8};
        int[] arr3={1};

        printResult(arr);
        printResult(arr2);
        printResult(arr3);
    }
}
