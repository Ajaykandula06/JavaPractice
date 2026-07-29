package RandomPractice;

public class RotateArray {
    public int[] rotate(int[] arr,int k){
        int n=arr.length;
        int[] arr2=new int[n];
        for(int i=0;i<k;i++){
        arr2[i]=arr[n-k+i];
            }
        for(int i=k;i<n;i++){
            arr2[i]=arr[i-k];
        }
        return arr2;
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

    public static void printResult(int[] arr,int n){
        System.out.print("Input ");
        printArray(arr);
        System.out.println("k: " + n);
        RotateArray obj=new RotateArray();
        System.out.print("Output ");
        printArray(obj.rotate(arr,n));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};int k=2;

        printResult(arr,k);
    }
}
