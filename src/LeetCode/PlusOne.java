package LeetCode;

public class PlusOne {
    public int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        System.out.print("{");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("} ");
        System.out.println();
    }

    public static void printResults(int[] arr){
        System.out.print("Input");
        printArray(arr);
        System.out.print("Result ");
        PlusOne obj=new PlusOne();
        printArray(obj.plusOne(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] digits={1,2,3};
        int[] digits2={9};

        printResults(digits);
        printResults(digits2);
    }
}
