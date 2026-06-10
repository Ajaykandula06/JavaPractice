package Arrays;

public class ReverseArray {
    public static void reverse(int[] arr){
        int low=0;
        int high=arr.length - 1;
    while(low < high){
       swap(low,high,arr);
       low++;
       high--;
        }
    }

    public static void swap(int low,int high,int[] arr){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=arr[low];

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

    public static void main(String[] args){
        int[] arr={5,4,3,2,1};

        printArray(arr);
        reverse(arr);
        System.out.println();

        System.out.print("Reverse ");
        printArray(arr);
    }
}
