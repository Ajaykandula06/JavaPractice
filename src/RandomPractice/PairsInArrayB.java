package RandomPractice;

public class PairsInArrayB {
    public void pairs(int[] arr,int target){
        //HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]+arr[j]==target){
                  System.out.print("(" + arr[i] + "," + arr[j] + ") ");
              }
          }
        }
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

    public static void printResult(int[] arr,int target){
        System.out.print("Input: ");
        printArray(arr);
        System.out.println("Target: " + target);
        PairsInArrayB obj=new PairsInArrayB();
        obj.pairs(arr, target);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,2,4};
        int t=5;

        printResult(arr,t);
    }
}
