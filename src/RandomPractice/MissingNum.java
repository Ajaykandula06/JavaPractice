package RandomPractice;

public class MissingNum {
    public int missing(int[] arr){
        int n=arr.length+1;
        int actualSum=n*(n+1)/2;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
        }
       return actualSum-currentSum;
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
