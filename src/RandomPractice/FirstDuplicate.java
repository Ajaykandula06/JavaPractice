package RandomPractice;

import java.util.HashMap;

public class FirstDuplicate {
    public int first(int[] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return arr[i];
            }
            map.put(arr[i],1);
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
        FirstDuplicate obj=new FirstDuplicate();
        System.out.println("Output: " + obj.first(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={2, 5, 1, 2, 3, 5};
        int[] arr2={2,3,4,5,6,4,3,5,5,2,2,1,1};

        printResult(arr);
        printResult(arr2);
    }
}
