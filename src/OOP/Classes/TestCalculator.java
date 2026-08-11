package OOP.Classes;

public class TestCalculator {
    public static void main(String[] args) {

    Calculator r1=new Calculator(10,"0");
    Calculator r2=new Calculator(20,"10");
    Calculator r3=new Calculator(30,"20");

    r1.add(20);
    r1.printResult();
    System.out.println();

    r1.subtract(5);
    r1.printResult();
    System.out.println();

    r1.division(2);
    r1.printResult();
    System.out.println();

    r1.multiply(3);
    r1.printResult();
    System.out.println();


        r2.add(20);
        r2.printResult();
        System.out.println();

        r2.subtract(3);
        r2.printResult();
        System.out.println();

        r2.division(2);
        r2.printResult();
        System.out.println();

        r2.multiply(7);
        r2.printResult();
        System.out.println();

        r3.add(20);
        r3.printResult();
        System.out.println();

        r3.subtract(1);
        r3.printResult();
        System.out.println();

        r3.division(9);
        r3.printResult();
        System.out.println();

        r3.multiply(4);
        r3.printResult();


}
}
