package LeetCode.ArrayProblems;

public class MaxPopulationYear {
    public static int Maxyear(int[][] logs){
        int[] population = new int[101];
        for(int i=0;i < logs.length;i++){
            for(int year=logs[i][0];year < logs[i][1];year++){
                population[year-1950]++;
            }
        }
        int max=population[0];
        int index=0;
        for(int i=0;i<population.length;i++){
            if(population[i] > max) {
                max = population[i];
                index = i;
            }
        }
        return 1950+index;

    }

    public static void printArray(int[][] arr){
        System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print("{");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
                if(j < arr[i].length -1){
                    System.out.print(",");
                }
            }
            System.out.print("} ");
        }
        System.out.println();
    }

    public static void printResult(int[][] arr){
        System.out.print("Given ");
        printArray(arr);
        int year=Maxyear(arr);
        System.out.println("Most Populated year is : " + year);
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] logs={{1993,1999},{2000,2010}};
       int[][] logs2 = {{1950,1961},{1960,1971},{1970,1981}};

        printResult(logs);
        printResult(logs2);
    }
}
