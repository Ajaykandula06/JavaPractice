package RandomPractice;

public class Factorial {
    public int factorial(int num){

        if(num==1)return 1;
        return num*factorial(num-1);
    }

    public static void printResult(int num){
        System.out.println("num: " + num);
        Factorial obj=new Factorial();
        System.out.println("factorial of given num: " + obj.factorial(num));
        System.out.println();
    }

    public static void main(String[] args) {
        int num=5;

        printResult(num);
    }
}
