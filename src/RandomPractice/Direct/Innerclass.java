package RandomPractice.Direct;

public class Innerclass {
     static class Test{//class is static one means it not depends on the objects of outerclass with innner class name
        String name;
        public Test(String name) {
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a= new Test("Peter");//they are objeccts for the test class ,
        Test b= new Test("Eddie");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
