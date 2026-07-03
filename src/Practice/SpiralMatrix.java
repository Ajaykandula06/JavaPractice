package Practice;

public class SpiralMatrix {
    public void spiral(int[][] mat){
        int startRow=0;
        int startCol=0;
        int endRow= mat.length-1;
        int endCol=mat[0].length-1;

        while (startCol<=endCol && startRow<=endRow) {

            for(int top=startCol;top <= endCol;top++){
                System.out.print(mat[startRow][top] +" ");
            }
            for(int right=startRow+1;right <= endRow;right++){
                System.out.print(mat[right][endCol] + " ");
            }
            for(int bottom=endCol-1;bottom >= startCol;bottom--){
                System.out.print(mat[endRow][bottom] + " ");
            }
            for(int left=endRow-1;left > startRow;left--){
                System.out.print(mat[left][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }

    public static void printMat(int[][] mat){
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

    public static void printResult(int[][] mat){
        System.out.print("Input ");
        printMat(mat);
        SpiralMatrix obj=new SpiralMatrix();
        System.out.print("Spiral: ");
        obj.spiral(mat);
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
    printResult(mat);
    }
}
