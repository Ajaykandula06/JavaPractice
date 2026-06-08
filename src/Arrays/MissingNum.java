package Arrays;

public class MissingNum {
    public static int findMissing(int[] arr){
        int n=arr.length+1;
        int actualSum=(n * (n+1))/2;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
        }
        return actualSum - currentSum;
    }

    public static int[] insertMissing(int[] arr,int num){
        int[] result=new int[arr.length + 1];
        for(int i=0,j=0;i<result.length;i++){
            if(i+1==num){
                result[i]=num;
            }else{
                result[i]=arr[j++];
            }
        }
        return result;
    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={1,2,4,5,6,7};
        int[] arr2 = {2, 3, 4, 5, 6};
        int[] arr3 = {1, 2, 3, 4, 5};

        printArray(arr);
        int num=findMissing(arr);
        System.out.println("Missing Number: " + num);
        System.out.println("After Adding the Missing Element");
        printArray(insertMissing(arr,num));
        System.out.println();

        printArray(arr2);
        int num2=findMissing(arr2);
        System.out.println("Missing Number: " + num2);
        System.out.println("After Adding the Missing Element");
        printArray(insertMissing(arr2,num2));
        System.out.println();

        printArray(arr3);
        int num3=findMissing(arr3);
        System.out.println("Missing Number: " + num3);
        System.out.println("After Adding the Missing Element");
        printArray(insertMissing(arr3,num3));
        System.out.println();
    }
}




