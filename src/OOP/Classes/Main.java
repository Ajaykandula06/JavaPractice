package OOP.Classes;

public class Main {
    public static void main(String[] args) {
    Student s1=new Student("Ajay",21,'A');
    Student s2=new Student("Alice",23,'C');
    Student s3=new Student("Robert",20,'B');

    s1.introduce();
    s1.printDetails();
        System.out.println();

        s2.introduce();
        s2.printDetails();
        System.out.println();

        s3.introduce();
        s3.printDetails();
        System.out.println();
    }
}
