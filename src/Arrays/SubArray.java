package Arrays;

public class SubArray {
    public static void sub(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j < arr.length;j++){
                System.out.print("SubArray: ");
               for(int k=i;k<=j;k++){
                   System.out.print( arr[k] + " ");
               }
                System.out.println();
            }
        }

    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        printArray(arr);
        sub(arr);
    }
}
