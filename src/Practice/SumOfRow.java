package Practice;

public class SumOfRow {
    public int sum(int[][] mat,int row){
        int sum=0;
        for(int i=row-1;i<row;i++){
            for(int j=0;j<mat[i].length;j++){
                sum += mat[i][j];
            }
        }
        return sum;
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

    public static void printResult(int[][] mat,int row){
        System.out.print("Input ");
        printMat(mat);
        System.out.println("Given row: " + row);
        SumOfRow obj=new SumOfRow();
        System.out.println("Sum of " + row + " row is: " + obj.sum(mat,row));
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};int row=3;
        int[][] mat2={{4,3,6},{5,9,8},{9,7,2}};int row2=1;

        printResult(mat,row);
        printResult(mat2,row2);
    }
}
