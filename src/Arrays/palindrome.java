package Arrays;

public class palindrome {
    public static boolean Ispalindrome(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
           if(arr[low] != arr[high]){
               return false;
            }
            high--;
            low++;

        }
        return true;
    }
    public static void printResults(boolean ans){
        if(ans){
            System.out.println("Given array is palindrome");
        }else{
            System.out.println("Given array is not palindrome");
        }
    }
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={1,2,1,1,2,1};
        int[] arr2={1,2,3,2,1};
        int[] arr3={1,2,3,4,5};

        printArray(arr);
        printResults(Ispalindrome(arr));
        System.out.println();

        printArray(arr2);
        printResults(Ispalindrome(arr2));
        System.out.println();

        printArray(arr3);
        printResults(Ispalindrome(arr3  ));
    }
}
