package LeetCode;

public class RichestCustomer {
    public static int maximumWealth(int[][] accounts){
        int max=0;
        for(int i=0;i < accounts.length;i++){
            int sum=0;
            for(int j=0;j < accounts[i].length;j++){
                sum += accounts [i][j];
            }
            if( sum > max){
               max = sum ;
            }
        }
        return max;
    }

    public static void print2DArray(int[][] arr) {
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  row " + i + ": [");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    public static void printResult(int[][] arr){
        System.out.print("Original: ");
        print2DArray(arr);
        System.out.println("The Maximum Wealth is: " + maximumWealth(arr));
        System.out.println();

    }

    public static void main(String[] args) {
       int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts2 = {{1,5},{7,3},{3,5}};
      int[][]  accounts3 ={{2,8,7},{7,1,3},{1,9,5}};


      printResult(accounts);
      printResult(accounts2);
      printResult(accounts3);



    }
}
