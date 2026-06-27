package LeetCode;

import java.sql.SQLOutput;

public class ReshapeMatrix {
    public int[][] matReshape(int[][] mat,int r,int c){
        int[][] arr=new int[r][c];
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                arr[i][j] = mat[i][j];
            }
            int next=0;
            if(arr[i][i+next] != mat[i][i+next]){
                System.out.println("we can't reshape the matrix");
                return mat;
            }
            next++;
        }
        return arr;
    }

    public static void printMatrix(int[][] mat){
        System.out.print("Matrix: ");
        for(int i=0;i<mat.length;i++){
            System.out.print("{");
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]);
                if(j<mat[i].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("} ");
        }
        System.out.println();
    }

    public static void printResult(int[][] mat,int r,int c){
        System.out.print("Input ");
        printMatrix(mat);
        System.out.println("Given r: " + r);
        System.out.println("Given c: " + c);
        ReshapeMatrix obj=new ReshapeMatrix();
        printMatrix(obj.matReshape(mat,r,c));
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=1,c=4;

        printResult(mat,r,c);
    }
}
