package RandomPractice;

public class MaxProduct {
    public int product(int[] arr){
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            int product=arr[i]*arr[i+1];
            if(product>max)max=product;
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
        MaxProduct obj=new MaxProduct();
        System.out.println("MaxProduct of the subArray: " + obj.product(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        int[] nums2={-2,0,-1};

        printResult(nums);
        printResult(nums2);
    }
}
