package RandomPractice;

public class SecondLargest {
    public int secon(int[] arr){
        int high=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            high=Math.max(high,arr[i]);
            if(arr[i]<high && second<arr[i]) second=arr[i];
        }
        if(high==second){
            System.out.println("There is no Second Largest!");
        }
            return second;

    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i< arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(int[] arr){
        System.out.print("Input : ");
        printArray(arr);
        SecondLargest obj=new SecondLargest();
        System.out.println("Output: " + obj.secon(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={12, 35, 1, 10, 34, 1};
        int[] arr2={5, 1, 2, 3, 4};
        int[] arr3={1, 1, 1, 1};
        int[] arr4={10, 5};

        printResult(arr);
        printResult(arr2);
        printResult(arr3);
        printResult(arr4);

    }
}
