package LeetCode.ArrayProblems;

import java.util.List;

public class LuckyNumber {
    public List<Integer> luckyNumber(int[][] mat){
        for(int i=0;i< mat.length;i++) {
            int low = mat[i][0];
            int col = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < low) {
                    low = mat[i][j];
                    col = j;
                }
            }
            int max=mat[0][col];

            for (int k = 0; k < mat.length; k++) {
                    if (mat[k][col] > max){
                        max = mat[k][col];

                    }
            }
            if(low  == max )return List.of(max);
        }
        return List.of();
    }

    public static void printMatrix(int[][] mat){
        System.out.print("Matrix: ");
        for(int i=0;i<mat.length;i++){
            System.out.print("{");
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]);
                if(j < mat[i].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("} ");
        }
        System.out.println();
    }

    public static void printResult(int[][] arr){
        System.out.print("Given ");
        printMatrix(arr);
        LuckyNumber obj=new LuckyNumber();
        List<Integer> result=obj.luckyNumber(arr);
        System.out.println("Lucky numbers in the Given Matrix: " + result + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int[][]  matrix2 = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        int[][] matrix3= {{7,8},{1,2}};



        printResult(matrix);
        printResult(matrix2);
        printResult(matrix3);
    }
}
