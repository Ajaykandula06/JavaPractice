package RandomPractice;

public class ArmStrong {
    public boolean checkArmStrong(int num){
        int n=num;
        int sum=0;
        int power= String.valueOf(num).length();
        while(n>0){
            int lastdigit=n%10;
            int factor=lastdigit;
            int i=power;
            while(i>1){
                factor*=lastdigit;
                i--;
            }
            sum+=factor;
            n/=10;
        }

        return num==sum;
    }

    public static void printResult(int num){
        System.out.println("Input: " + num);
        ArmStrong obj=new ArmStrong();
        System.out.println("Is given number is a ArmStrong Number?? " + obj.checkArmStrong(num));
        System.out.println();
    }

    public static void main(String[] args) {
        int num=153;
        int num2=370;
        int num3=9474;
        int num4=123;

        printResult(num);
        printResult(num2);
        printResult(num3);
        printResult(num4);
    }
}
