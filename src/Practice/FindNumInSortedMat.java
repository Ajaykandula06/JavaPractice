package Practice;

public class FindNumInSortedMat {
    public int[] findNum(int[][] mat,int target){
        int m=mat.length;
        int n=mat[0].length;
        int row=0;
        int col= n-1;
        while(row<m && col>=0){
            if(mat[row][col]==target){
                return new int[]{row,col};
            }else if(mat[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
}

public static void printMat(int[][] mat){
    System.out.print("Matrix: ");
    for(int i=0;i<mat.length;i++){
        System.out.print("{");
        for(int j=0;j<mat[0].length;j++){
            System.out.print(mat[i][j]);
            if(j<mat[i].length-1){
                System.out.print(",");
            }
        }
        System.out.print("} ");
    }
    System.out.println();
}

public static void printResult(int[][] mat,int target){
    System.out.print("Input ");
    printMat(mat);
    FindNumInSortedMat obj =new FindNumInSortedMat();
    int[] result= obj.findNum(mat,target);
    if(result[0]!=-1){
        System.out.println("Target Found at row: "+result[0]+", column: " + result[1]);
    }else{
        System.out.println("Target not Found");
    }
    System.out.println();
}

    public static void main(String[] args) {
        int[][] mat={{1,2,3}, {4,5,6}, {7,8,9}};int target=9;

        printResult(mat, target);

    }
}
