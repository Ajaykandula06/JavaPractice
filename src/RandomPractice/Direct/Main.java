package RandomPractice.Direct;

import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        // A class is an object and object is an instance of the class
// class is logical construct and object is physical reality which actually occupies the space in memory or ram ,whatever
        //Student s1=new Student();******  left side  run comiple time == right run at compile time
        //the new keywords allocate the memory at runtime and returns a reference variable to it
        //all classes in java must be allocated in dynamically
        Student s1=new Student();
        System.out.println(s1);
        System.out.print(s1.ronum +" , ");
        System.out.print(s1.name + " , "); //here we are trying print the variables before they are initialised
        System.out.print(s1.marks + " , ");//**since it printing the justin details because of the default constructor
        s1.greeting();//so they give the default values
        System.out.println();

        Student s2=new Student();
        s2.ronum=91;
        s2.name="Saddie"; // at here we  initialised the variables
        s2.marks=78.5f; // so they are about give the whatever values that are assigned

        System.out.print(s1.ronum + " , ");
        System.out.print(s1.name + " , ");
        System.out.print(s1.marks + " , ");
        s2.greeting();
        System.out.println();

        Student s3=new Student();
        System.out.print(s3.ronum + " , ");
        System.out.print(s3.name +" , ");
        System.out.print(s3.marks+" , ");
        s3.greeting();//so when we are calling this function from this object ,internally this keyword changes with the
        //whatever objeect name your calling from so it prints the name that you have on the object
        System.out.println();

        Student s4=new Student(501,"Jacob",87f);
        System.out.print(s4.name + " , ");
        System.out.print(s4.ronum + " , ");
        System.out.print(s4.marks + " , ");
        s4.changeName("Logan");// here when we change name the jacob turned into logan and we can see that in the output
        System.out.print(s4.name);//first it shows name jacob and now it shows logan
        System.out.println();

        Student random=new Student(s2);
        System.out.println(random.name + " , "+random.marks);//this is going to print the name of s2 object which is saddie
        //so when we are pointing to the other object ,it's assigned values are going to print in this object as well

        Student s5=new Student(43,"Dean",89);
        System.out.println(s5.ronum + " , " + s5.name + " , " + s5.marks);


        Student s6=new Student(42,"Lucas",89);
        Student s7=s6; // here we are pointing the object to the other object so it have the variables as the s6
        System.out.println(s7.name);//it is going to print lucas
        //if we change something in s6 it might be change in the s7 to ,cause both are pointing the same reference variable
        s6.changeName("Mike");
        System.out.println(s7.name);//it prints mike

        final Student s8=new Student();//here the final keywords means it is immutable
        s8.name="ajay";//but here we can change the values ,but the object is cannot change in this part cause it is final keyword
        s8.changeName("vijay");//so we cannot change like s8=s9 ot pointing to the other objects
        //simply when the nonpremitive is final we can reassign it

    }
}

class Student {
    //created class with 3 properties
    //instance variables are the variables which are declared inside  the class and outside the method

    int ronum; //Every student has these 3 things
    String name;
    float marks;

    //we need a way to add values to the above properties object by object
    //we need one word to access every object
    Student() {
        this.ronum = 1;  //**Constructor is special function ,that runs
        this.name = "justin";// when you create an object and allocates some varibles as you like.
        this.marks = 98.9f;//**so a constructor has some arguments
        // if there is no arguments are allocating ,then it is a by **defualt constructor** but we are passing none here
        //it is not a default constructor //when ever we pass none refernce varibles it is going to give this varibles

    }


    //a method in class
    void greeting() {
        System.out.println("Hello!, this is " + this.name);
        //this keyword refers to the whatever name we about give
        //it prints the name which is assigned to the object that your calling from
    }

    void changeName(String name){
        this.name=name;
    }

    Student(int rollnum,String naame,float score){
        ronum=rollnum;
        name=naame; // at here the passing varibale names are not same as the properties so we can just write like this
       marks=score; // but if the names are same we should** do like this.ronum=ronum ,then it works
    }

    //now we are creating a constructor which refer to the another constructor
    Student( Student other){
        this.ronum = other.ronum;//we are trying with the object called random in the main method
        this.name=other.name;
       this. marks=other.marks;
    }
}





