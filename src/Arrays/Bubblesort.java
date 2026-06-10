package Arrays;

public class Bubblesort {
    public static void sort(int[] arr){
        int n=arr.length;

        for(int t=0;t<arr.length;t++) {
            for (int i = 0; i < n - 1 -t; i++) {
                int curr = arr[i];
                int next = arr[i + 1];
                if (curr > next) {
                    swap(i, arr);
                }
            }
        }
    }

    public static void swap(int i,int [] arr){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        printArray(arr);
        System.out.println();

        System.out.println("After sorting the array");
        sort(arr);
        printArray(arr);
    }
}
