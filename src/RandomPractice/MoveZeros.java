package RandomPractice;

public class MoveZeros {
    public int[] mover(int[] arr) {
        int index=0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] != 0){
               arr[index]=arr[i];
               index++;
           }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
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
        MoveZeros obj=new MoveZeros();
        System.out.print("Output ");
        printArray(obj.mover(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={0, 1, 0, 3, 12};
        int[] arr2={0, 0, 1};
        int[] arr3={1, 0, 0, 0, 3, 12};

        printResult(arr);
        printResult(arr2);
        printResult(arr3);
    }
}
