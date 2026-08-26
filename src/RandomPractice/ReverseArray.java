package RandomPractice;

public class ReverseArray {
    public int[] reverse(int[] arr){
        int mid=arr.length/2;
        int n=arr.length-1;
        for(int i=0;i<mid;i++){
            int temp=arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=temp;
        }
        return arr;
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

    public static void printResult(int[] arr){
        System.out.print("Input ");
        printArray(arr);
        ReverseArray obj=new ReverseArray();
        System.out.print("Output ");
        printArray(obj.reverse(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6};

        printResult(arr);
    }
}
