package OOP.Classes;

public class Student {
    String name;
    int age;
    char grade;
    Student(String name,int num,char ch){
        this.name=name;
        this.age=num;
        this.grade=ch;
    }

    void introduce(){
        System.out.println("Hi ,I am " + name);
    }

    boolean ispass(){
        if(grade=='A' || grade=='B')return true;
        else return false;
    }
    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("grade: " + grade);
        System.out.println("Passed " + ispass());
    }
}
