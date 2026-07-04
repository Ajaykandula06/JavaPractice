package LeetCode.ArrayProblems;

public class MatDaigonalSum {
    public static int sum(int[][] mat){
        int sum = 0;
        int n = mat.length;
        for(int i=0;i < mat.length;i++){
            sum += mat[i][i];
            sum += mat[i][n-1-i];
            if(i == n-1-i){
                sum -= mat[i][i];
            }
        }
        return sum;
    }

    public static void printResult(int[][] arr){
        int sum = sum(arr);
        System.out.println("Matrix Daignal Sum is: " + sum);
        System.out.print("Matrix: ");
        for(int i=0;i < arr.length;i++){
            System.out.print("[");
            for(int j=0;j < arr[i].length;j++){
                System.out.print(arr[i][j]);
                if(j < arr[i].length - 1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] mat1 = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};

    printResult(mat);
    System.out.println();
    printResult(mat1);    }
}
