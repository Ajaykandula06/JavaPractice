package Arrays;

public class ZeroMoving {
    public static void move(int[] arr) {
        int insertpos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertpos] = arr[i];
                insertpos++;
            }
        }
        for (int i = insertpos; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void printArray(int[] arr){
        System.out.println("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={0,1,0,4,0,7,0,8};

        System.out.println("Before Moving the Zeros");
        printArray(arr);
        System.out.println();

        move(arr);
        System.out.println("After Moving the Zeros");
        printArray(arr);
    }
}

