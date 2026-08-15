package RandomPractice;

public class CheckSorted {
    public boolean isSorted(int[] arr){
        int move=arr[0];
        for(int i=1;i<arr.length;i++){
            if(move<=arr[i]){
                move=arr[i];
            }else{
                return false;
            }
        }
        return true;
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
        CheckSorted obj=new CheckSorted();
        System.out.println("Is the array sorted? " + obj.isSorted(arr) );
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int[] arr2={1, 3, 2, 4, 5};
        int[] arr3={1, 1, 2, 3};

        printResult(arr);
        printResult(arr2);
        printResult(arr3);
    }
}
