public class MergeSort {
    public static void sort(int[] arr){
        int length=arr.length;
        if(length <= 1){
            return ;
        }

        int mid=arr.length /2;
        int[] left=new int[mid];
        int[] right=new int[length - mid];

        for(int i=0;i< mid;i++)
            left[i]=arr[i];

        for(int i=mid;i<arr.length;i++)
            right[i -mid]=arr[i];


        sort(left);
        sort(right);

        merge(left,right,arr);
    }

    public static void merge(int[] left,int[] right,int[] arr){

        int l=0;
        int r=0;
        int i=0;

        while(l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                arr[i] = left[l];

                l++;
                i++;
            } else {
                arr[i] = right[r];

                r++;
                i++;
            }
        }

            while(l < left.length){
                arr[i] = left[l];

                l++;
                i++;
            }

            while(r < right.length){
                arr[i] = right[r];

                r++;
                i++;
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

    public static void main (String[] args){
        int[] arr={90,12,4,6,9,24,65,116,};

        printArray(arr);
        sort(arr);
        System.out.print("Sorted ");
        printArray(arr);
    }
}
