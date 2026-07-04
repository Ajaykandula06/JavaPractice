package Practice;

public class Count {
    public int countNum(int[][] mat,int target){
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==target)count++;
            }
        }
        return count;
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

    public static void printResult(int[][] mat,int num){
        System.out.print("Input ");
        printMat(mat);
        System.out.println("Given target num: " + num);
        Count obj=new Count();
        System.out.println("Number of " + num + "'s in the Matrix: " + obj.countNum(mat,num));
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] mat={{4,7,8},{8,8,7},{7,7,7}}; int element=7;
        int[][] mat2={{1,2,3},{4,5,6},{7,8,9}};int element2=0;
        int[][] mat3={{9,1,8},{2,-1,-1},{7,6,5}};int element3=1;

        printResult(mat,element);
        printResult(mat2,element2);
        printResult(mat3,element3);

    }
}
