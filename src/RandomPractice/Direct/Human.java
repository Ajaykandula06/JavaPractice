package RandomPractice.Direct;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;//static varibles are the variables which stays same for evrything and it can be accessed
    //without creating any objects ,they are not depend on the object at all ,we can just access it by the class name itself

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;//this varibale is same for everyone unlike details,so we can specify it through this and
        //class name itself , we should specify it as static in the properties so it can work
    }


}
