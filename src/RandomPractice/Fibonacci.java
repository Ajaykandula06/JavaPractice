package RandomPractice;

import java.beans.PropertyEditorSupport;

public class Fibonacci {
public static void printFibonacci(int first,int second,int n){
    System.out.print(first + "," + second + ",");
    for(int i=0;i<n;i++){
       int result=first+second;
       first=second;
        second=result;
        System.out.print(result);
        if(i<n-1){
            System.out.print(",");
        }
    }
    System.out.println(".");
}

public static void printResult(int first,int second,int range){
    System.out.println("firstnumber: " + first);
    System.out.println("Secondnumber: " + second);
    System.out.println("range: " + range);
    System.out.print("series: ");
    printFibonacci(first, second, range);
    System.out.println();
}

    public static void main(String[] args) {
        int first=0,second=1,n=5;

        printResult(first,second,n);

    }
}
