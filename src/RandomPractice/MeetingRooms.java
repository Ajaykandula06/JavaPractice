package RandomPractice;

import java.util.Arrays;
public class MeetingRooms {
    public int NeedRooms(int[][] arr) {
        for (int[] row : arr) {
            Arrays.sort(row);
        }
        int[] start = new int[arr.length];
        int[] end = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0, j = 0;
        int rooms = 0, maxRooms = 0;

        while (i < start.length) {
            if (start[i] < end[j]) {
                rooms++;
                i++;
            } else {
                rooms--;
                j++;
            }
        }
        maxRooms=Math.max(maxRooms,rooms);
        return maxRooms;
    }

    public static void print2DArray(int[][] arr){
        System.out.print("Array: ");
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print("{");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
                if(j<arr[i].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("}");
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();

    }
    public static void printResult(int[][] arr){
        System.out.print("Input ");
        print2DArray(arr);
        MeetingRooms obj=new MeetingRooms();
        int result=obj.NeedRooms(arr);
        System.out.println("Output: " + result);
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr={{0,30},{5,10},{15,20}};
        int[][] arr2={{7,10},{2,4}};

        printResult(arr);
        printResult(arr2);
    }
}
