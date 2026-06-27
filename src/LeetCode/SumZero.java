package LeetCode;

public class SumZero {
    public int[] sumZero(int n){
        int[] arr=new int[n];
        int add=1;
        for(int i=0;i<n-1;i+=2){
            arr[i]=-add;
            arr[i+1]=add;
            add++;
        }
        if(n%2!=0)arr[n-1]=0;
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

    public static void printResult(int n){
        System.out.println("Given n: " + n);
        SumZero obj=new SumZero();
        System.out.print("Result ");
        printArray(obj.sumZero(n));
        System.out.println();

    }

    public static void main(String[] args) {
        int n=5,n2=3,n3=1;

        printResult(n);
        printResult(n2);
        printResult(n3);
    }
}
