package RandomPractice;

public class MinMax
{
    public int[] minmax(int[] arr){
        int max=arr[0];
        int min=arr[0];;
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        return new int[]{max,min};
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
        System.out.print("input ");
        printArray(arr);
        MinMax obj=new MinMax();
        int result[]=obj.minmax(arr);
        System.out.println("Max: " + result[0]);
        System.out.println("min: " + result[1]);
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={3, 1, 4, 1, 5, 9, 2, 6};
        printResult(arr);
    }
}

