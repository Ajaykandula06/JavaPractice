package LeetCode;
public class ReshapeMatrix {
    public int[][] matReshape(int[][] mat,int r,int c){
        int m=mat.length;
        int n=mat[0].length;
        if(m*n != r*c)return mat;
        int[][] arr=new int[r][c];
        for(int k=0;k<m*n;k++){
            arr[k/c][k%c]=mat[k/n][k%n];
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

    public static void possible(int[][] mat,int r,int c){
        ReshapeMatrix obj=new ReshapeMatrix();
        int[][] check= obj.matReshape(mat,r,c);
        if(check==mat){
            System.out.println("The Reshaping of the Matrix is not Possible, Result Matrix remain Same");
        }else{
            System.out.println("THe Reshaping of the Matrix is Possible");
        }

    }

    public static void printResult(int[][] mat,int r,int c){
        System.out.print("Input ");
        printMatrix(mat);
        System.out.println("Given r: " + r);
        System.out.println("Given c: " + c);
        possible(mat, r, c);
        ReshapeMatrix obj=new ReshapeMatrix();
        System.out.print("Result ");
        printMatrix(obj.matReshape(mat,r,c));
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=1,c=4;

        int[][] mat2={{1,2},{3,4}};
        int r2=2,c2=4;

        printResult(mat,r,c);
        printResult(mat2,r2,c2);
    }
}
