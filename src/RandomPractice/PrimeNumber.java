package RandomPractice;

public class PrimeNumber {
    public boolean isPrime(int num){
        if(num<=1)return false;
        for(int i=2;i<num;i++){
            if(i!=num && num%i==0)return false;
        }
        return true;
    }

    public static void printResult(int num){
        System.out.println("Num: " + num);
        PrimeNumber obj=new PrimeNumber();
        System.out.println("Is the number Prime?? " + obj.isPrime(num));
        System.out.println();
    }

    public static void main(String[] args) {
        int num=3,num2=2,num3=7,num4=10;


        printResult(num);
        printResult(num2);
        printResult(num3);
        printResult(num4);
    }
}
