package Arrays;

import java.util.*;

public class BinarySearch {
    public static int search(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid=(low+high)/2;
            if (arr[mid] == element) {
                return mid;
            } else if (element < arr[mid]) {
                high = mid - 1;
            } else if (element > arr[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void printResult(int num){
        if(num == -1){
            System.out.println("Given element is not present in the array");
        }else{
            System.out.println("Element found at index: " + num);
        }
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
        int[] arr={10,20,30,40,50,60,70,80,90};
        printArray(arr);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element from the array: ");
        int num=sc.nextInt();

        printResult(search(arr,num));
        sc.close();
    }
}
