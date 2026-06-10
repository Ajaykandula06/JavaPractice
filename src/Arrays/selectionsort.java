package Arrays;

public class selectionsort {
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int mini=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j] < arr[mini]){
                    mini=j;
                }
            }
            swap(i,mini,arr);

        }
    }

    public static void swap(int i,int mini,int[] arr){
        int temp=arr[i];
        arr[i]=arr[mini];
        arr[mini]=temp;
    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i < arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={20,12,10,15,2};
        int[] arr2={-1,30,900,4538,-60};
        int[] arr3={66,93,63,93,47,26};

        printArray(arr);
        sort(arr);
        System.out.println("After sorting the array");
        printArray(arr);
        System.out.println();

        printArray(arr2);
        sort(arr2);
        System.out.println("After sorting the array");
        printArray(arr2);
        System.out.println();

        printArray(arr3);
        sort(arr3);
        System.out.println("After sorting the array");
        printArray(arr3);
    }
}
