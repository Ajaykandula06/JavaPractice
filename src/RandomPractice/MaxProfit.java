package RandomPractice;

public class MaxProfit {
    public int max(int[] arr){
        int minprice=arr[0];
        int maxprofit=0;
        for(int i=1;i<arr.length;i++){
            int profit=arr[i]-minprice;
            maxprofit=Math.max(maxprofit,profit);
            minprice=Math.min(minprice,arr[i]);
        }
        return maxprofit;
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

    public static void printResult(int[] arr){
        System.out.print("Input: ");
        printArray(arr);
        MaxProfit obj=new MaxProfit();
        System.out.println("Output: " + obj.max(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num={7,1,5,3,6,4};
        int[] num2={7,6,4,3,1};
        int[] num3={1,2,3,4,5};
        int[] num4={2,4,1};

        printResult(num);
        printResult(num2);
        printResult(num3);
        printResult(num4);
    }
}
