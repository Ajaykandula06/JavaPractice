package Arrays;

public class QuickSort {
    public static void sort(int[] arr,int start, int end){
        if(end <= start){
            return;
        }
        int pivot=partition(arr, start, end);
        sort(arr,start,pivot -1);
        sort(arr,pivot + 1,end);

    }

    public static int partition(int[] arr, int start, int end){
        int pivot=arr[end];
        int i=start - 1;

        for(int j=start;j <= end-1; j++){
            if(arr[j] < pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;

        return i;
    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={2,5,6,3,1,8,4,7,9};

        printArray(arr);
        sort(arr,0,arr.length-1);
        System.out.print("Sorted ");
        printArray(arr);
    }
}
