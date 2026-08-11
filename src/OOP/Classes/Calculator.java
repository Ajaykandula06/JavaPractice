package OOP.Classes;

public class Calculator {
    double result;
    String history;


    Calculator(double result,String history){
        this.result=result;
        this.history=history;
    }

    void add(int num){
        System.out.println("Performing Addition " +result+ " with " + num);
        result+=num;
    }

    void subtract(int num){
        System.out.println("Performing Subtraction " + result + " with " + num);
        result-=num;
    }

    void multiply(int num){
        System.out.println("Performing Multiplication "+result+ " with " + num);
        result*=num;
    }

    void division(int num){
        if(num==0) {
            System.out.println("Cannot divide by Zero");
        }else{
            System.out.println("performing Division " + result + " with " + num);
            result/=num;

        }
    }

    void reset(){
        System.out.println("Resetting");
        result=0;
    }

    void printResult(){
        System.out.println("result: " + result);
    }
}
