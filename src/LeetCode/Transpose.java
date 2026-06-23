package LeetCode;

public class Transpose {
    public static int[][] transpose(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int[][] result = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[j][i] = mat[i][j];
            }
        }
        return result;
    }

    public static void printArray(int[][] mat){
        System.out.print("Matrix: ");
        for(int i=0;i<mat.length;i++){
            System.out.print("{");
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]);
                if(j < mat[i].length - 1){
                    System.out.print(",");
                }
            }
            System.out.print("} ");
        }
        System.out.println();
    }

    public static void printResult(int[][] mat){
        System.out.print("Original ");
        printArray(mat);
        int[][] result=transpose(mat);
        System.out.print("Transposed ");
        printArray(result);
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6}};
        int[][] mat2={{2,4,-1},{-10,5,11},{18,-7,6}};

        printResult(mat2);
        printResult(mat);
    }
}
