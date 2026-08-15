package RandomPractice;

public class MissingNum {
    public int missing(int[] arr){
        int diff=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] != diff)return arr[i]+diff;
        }
        return -1;
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
        MissingNum obj=new MissingNum();
        System.out.println("Output: " + obj.missing(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5, 6};

        printResult(arr);
    }
}
