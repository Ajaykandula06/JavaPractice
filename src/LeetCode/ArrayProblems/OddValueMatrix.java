package LeetCode.ArrayProblems;

public class OddValueMatrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int odds = 0;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int ri = indices[i][0];
            int ci = indices[i][1];

            for (int j = 0; j < n; j++) {
                matrix[ri][j]++;
            }

            for (int k = 0; k < m; k++) {
                matrix[k][ci]++;
            }
        }
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] % 2 != 0) odds++;
            }
        }
        return odds;
    }

    public static void printResults(int m, int n, int[][] indices) {
        System.out.println("Given rows: " + m);
        System.out.println("Given columns: " + n);
        System.out.println("Given Indices: ");
        for (int i = 0; i < indices.length; i++) {
            System.out.print("{");
            for (int j = 0; j < indices[i].length; j++) {
                System.out.print(indices[i][j]);
                if(j < indices[i].length -1){
                    System.out.print(",");
                }
            }
            System.out.print("} ");
        }
        System.out.println();
        int num=oddCells(m,n,indices);
        System.out.println("Odds in the matrix are: " + num);
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices= {{0,1},{1,1}};

        int m2 = 2;
        int n2 = 2;
       int[][] indices2 = {{1,1},{0,0}};

        printResults(m,n,indices);
        System.out.println();
        printResults(m2,n2,indices2);
    }
}
