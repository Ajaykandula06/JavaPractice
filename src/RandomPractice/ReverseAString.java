package RandomPractice;

public class ReverseAString {
    public String[] reverseString(String[] arr){
        for(int i=0;i<arr.length/2;i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }

    public static void printArray(String[] arr){
        System.out.print("Array: {");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();

    }

    public static void printResult(String[] arr){
        System.out.print("Input ");
        printArray(arr);
        ReverseAString obj= new ReverseAString();
        String[] result=obj.reverseString(arr);
        System.out.print("Output ");
        printArray(result);
        System.out.println();
    }

    public static void main(String[] args){
        String[] arr={"h","e","l","l","o"};
        String[] arr2={"H","a","n","n","a","h"};

        printResult(arr);
        printResult(arr2);
    }
}
