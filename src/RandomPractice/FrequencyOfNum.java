package RandomPractice;

import java.util.HashMap;

public class FrequencyOfNum {
    public HashMap<Integer,Integer> howmany(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }

        }
        return map;
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
        FrequencyOfNum obj=new FrequencyOfNum();
        System.out.println(obj.howmany(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 3, 3, 4};
        int[] arr2={5, 5, 5, 5};
        int[] arr3={1, 2, 3, 4, 5};
        int[] arr4={2, 2, 2, 5, 5, 2};

        printResult(arr);
        printResult(arr2);
        printResult(arr3);
        printResult(arr4);
    }
}
