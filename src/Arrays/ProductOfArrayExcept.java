package Arrays;

public class ProductOfArrayExcept {

    public int[] product(int[] arr){
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int multi=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    multi*=arr[j];
                }
                result[i]=multi;
            }
        }
       return result;
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
        ProductOfArrayExcept obj=new ProductOfArrayExcept();
        System.out.print("Output ");
        int[] result=obj.product(arr);
        printArray(result);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr2={1,2,0,4};

        printResult(arr);
        printResult(arr2);
    }
}
