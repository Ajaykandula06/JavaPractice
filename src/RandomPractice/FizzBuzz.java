package RandomPractice;

public class FizzBuzz {
    public void printNum(int n){
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz");
            }
            else if(i%3==0){
                System.out.print("Fizz");
            }else if(i%5==0){
                System.out.print("Buzz");
            }else{
                System.out.print(i);
            }

            if(i<n-1){
                System.out.print(",");
            }
        }
    }

    public static void main(String[] args) {
        int n=10;

        FizzBuzz obj=new FizzBuzz();
        obj.printNum(n);
    }
}
