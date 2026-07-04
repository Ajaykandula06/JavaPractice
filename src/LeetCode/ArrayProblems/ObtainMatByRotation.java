package LeetCode.ArrayProblems;

public class ObtainMatByRotation {
    public static boolean findRotation(int[][] mat,int[][] target){
        int n=mat.length;
        boolean zero=true,ninety=true,oneEighty=true,twoSeventy=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(mat[i][j] != target[i][j]) zero=false;
               if (mat[n-1-j][i] != target[i][j]) ninety=false;
               if(mat[n-1-i][n-1-j] != target[i][j]) oneEighty=false;
                if(mat[j][n-1-i] != target[i][j]) twoSeventy=false;
            }
            }
        return zero||ninety||oneEighty||twoSeventy;
        }
        public static void printArray(int[][] arr){
            System.out.print("Matrix: ");
            for(int i=0;i<arr.length;i++){
                System.out.print("{");
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]);
                    if(j<arr[i].length-1){
                        System.out.print(",");
                    }
                }
                System.out.print("} ");
            }
            System.out.println();
        }
        public static void printResult(int[][] mat,int[][] target){
            System.out.print("Given ");
            printArray(mat);
            System.out.print("Target ");
            printArray(target);
            if(findRotation(mat,target)){
                System.out.println("The mat can equals to the target");
            }else {
                System.out.println("The mat can't equals to the target");
            }
            System.out.println();
       }

        public static void main(String[] args){
        int[][] mat={{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};

        int[][] mat2 = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target2 = {{1,1,1},{0,1,0},{0,0,0}};

        printResult(mat,target);
        printResult(mat2,target2);
        }
    }

