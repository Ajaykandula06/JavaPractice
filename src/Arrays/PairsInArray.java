package Arrays;

public class PairsInArray {
    public static void pairs(int[] arr, int sum){
        for(int i=0;i < arr.length -1;i++){
            for(int j=i+1;j < arr.length ;j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length -1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        printArray(arr);
        System.out.println("Pairs in the current Array:");
        pairs(arr,9);
    }
}
