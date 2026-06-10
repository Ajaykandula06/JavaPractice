package Arrays;

public class Insertionsort {
    public static void sort(int[] arr){

        for(int i=1;i<arr.length;i++){
           int curr=arr[i];
           int prev=i - 1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1]=arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if( i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={12,11,13,5,6};
        int[] arr2={97,112,43,-90,32,-55,-12,77};
        int[] arr3={98,502,76,-29,4,76,29,502,7543};

        printArray(arr);
        sort(arr);
        System.out.println("After sorting the Array");
        printArray(arr);
        System.out.println();

        printArray(arr2);
        sort(arr2);
        System.out.println("After sorting the Array");
        printArray(arr2);
        System.out.println();

        printArray(arr3);
        sort(arr3);
        System.out.println("After sorting the Array");
        printArray(arr3);

    }
}
