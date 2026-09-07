package RandomPractice;
import java.util.ArrayList;
import java.util.Arrays;
public class SumtoZero {
    public int[][] trippled(int[] arr){
        ArrayList<int[]>list=new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1])continue;
            int left=i+1,right=arr.length-1;

            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    list.add(new int[]{arr[i],arr[left],arr[right]});

                    while(left<right && arr[left]==arr[left+1])left++;
                    while(left<right && arr[right]==arr[right-1])right--;
                    left++;
                    right--;
                }
                else if(sum>0)right--;
                else left++;
            }
        }
        int[][] result= list.toArray(new int[0][]);
        return result;
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

    public static void print2DArray(int[][] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print("{");
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j]);
                if(j<arr[i].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("}");
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(int[] arr){
        System.out.print("Input ");
        printArray(arr);
        SumtoZero obj=new SumtoZero();
        int[][] result=obj.trippled(arr);
        System.out.print("Output: ");
        print2DArray(result);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={-1, 0, 1, 2, -1, -4};

        printResult(arr);
    }
}
