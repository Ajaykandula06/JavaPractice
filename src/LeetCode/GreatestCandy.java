package LeetCode;

public class GreatestCandy {
    public static boolean[] greatest(int[] candies,int extra) {
        boolean[] result = new boolean[candies.length];
        int max=candies[0];
        for(int i=1;i < candies.length;i++){
            if(candies[i] > max) max = candies[i];
        }
        for(int j=0;j < candies.length ;j++){
            result[j] = candies[j] + extra >= max;
        }
        return result;
    }

        public static void printOriginal(int[] arr,int extra){
        System.out.println("Extra candies: " + extra);
        System.out.print("Candies Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void printboolean(int[] arr,int extra){
        boolean[] result=greatest(arr, extra);
        System.out.print("Array: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
            if(i < result.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void printresult(int[] arr,int num){

        printOriginal(arr,num);
        System.out.print("Result ");
        printboolean(arr,num);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        int[] candies2 = {4,2,1,1,2};
        int extraCandies2 = 1;

        int[] candies3 = {12,1,12};
        int extraCandies3 = 10;


        printresult(candies,extraCandies);
        printresult(candies2,extraCandies2);
        printresult(candies3,extraCandies3);


    }
}
