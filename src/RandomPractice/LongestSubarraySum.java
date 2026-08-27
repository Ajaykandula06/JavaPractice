package RandomPractice;

public class LongestSubarraySum {
    public int longest(int[] arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
           for(int j=i;j<arr.length;j++){
              sum += arr[j];
              if(sum<=k){
                  count = Math.max(count,j-i+1);
              }else{
                  break;
              }
           }
        }
        return count;
    }

    public static void printArray(int[] arr){
        System.out.print("Input ");
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

    public static void printResult(int[] arr,int k) {
        System.out.print("Input: ");
        printArray(arr);
        System.out.println("k: " + k);
        LongestSubarraySum obj=new LongestSubarraySum();
        System.out.println("Output: " + obj.longest(arr, k));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 1, 1, 1};int k=3;
        int[] arr2={1,2,3,4,6,5,5,2,2,2,2,2,3,3,3,1};int k2=10;

        printResult(arr,k);
        printResult(arr2,k2);
    }
}
