package RandomPractice.Direct;

public class Staticblock {
    //to know more about static and how it works
    static int a=5;
    static int b;

    static {//it only runs once when the first object is created ,when the class is loaded for the first time,
        // we can see in the output ,that the message only prints only once
        System.out.println("Hello i am inside static");
        b = a*5;
    }

    public static void main(String[] args) {
        Staticblock s1= new Staticblock();
        System.out.println(s1.a + " " + s1.b);
        s1.b += 20;
        System.out.println(s1.b);

        Staticblock s2=new Staticblock();
        System.out.println(s2.a + " " + s2.b);
    }

}
