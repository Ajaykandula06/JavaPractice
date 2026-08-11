package Arrays;

public class ContainsDuplicate {
    public boolean isContain(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
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
        ContainsDuplicate obj=new ContainsDuplicate();
        System.out.println("is Array Contains duplicates? " + obj.isContain(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int[] arr2={1,2,3,4};
        int[] arr3={1,1,1,3,3,4,3,2,4,2};

        printResult(arr);
        printResult(arr2);
        printResult(arr3);
    }
}
