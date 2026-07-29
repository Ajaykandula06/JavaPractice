package RandomPractice;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public ArrayList intersection(int[] arr,int[] arr2) {
        ArrayList<Integer> common = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j] && !common.contains(arr[i])){
                    common.add(arr[i]);
                    break;
                }
            }
        }
        return common;
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

    public static void printList(int[] arr,int[] arr2){
        IntersectionOfArrays obj=new IntersectionOfArrays();
        System.out.println(obj.intersection(arr,arr2));
    }

    public static void printResult(int[] arr,int[] arr2){
        System.out.print("Input ");
        printArray(arr);
        System.out.print("Input ");
        printArray(arr2);
        System.out.print("Output: ");
        printList(arr,arr2);
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr1={1, 2, 2, 1},arr2={2,2};
        int[] arr3={4, 9, 5},arr4={9, 4, 9, 8, 4};


       printResult(arr1,arr2);
       printResult(arr3,arr4);
    }


}
