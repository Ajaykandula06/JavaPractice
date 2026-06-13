package Strings;
import java.util.*;
public class Intro {
    public static void name(String name){
        System.out.println("Hello! world");
        System.out.println("My name is " + name + ".");
    }

    public static void concat(String first,String last){
        System.out.println("Student's Full name is " + first + " " +last);
    }

    public static void firstChar(String firstname){
        System.out.println("First character is " + firstname.charAt(0));
    }

    public static void length(String lastname){
        System.out.println("Lastname Length is " + lastname.length());
    }

    public static void isEqual(String name){
        String secondname="ajay";
        System.out.println("Is the second name is equals to first " + secondname.equals(name));
        System.out.println("Is the second name is equals to first " + secondname==name);
        System.out.println("Is the second name is equals to first " + secondname.equalsIgnoreCase(name));

    }

    public static void lower(String name){
        System.out.println("converting the lastname into small alphabets " + name.toLowerCase());
    }

    public static void upper(String first,String last){
        System.out.println("Converting full name into Capital letters : " + first.toUpperCase() + " " + last.toUpperCase());
    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter last name: ");
        String last=sc.nextLine();


      name(name);
        System.out.println();

      concat(name,last);
        System.out.println();

      firstChar(name);
        System.out.println();

      length(last);
        System.out.println();

      isEqual(name);
        System.out.println();

      lower(name);
        System.out.println();

      upper(name,last);

    }
}
