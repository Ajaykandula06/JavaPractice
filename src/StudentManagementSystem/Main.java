package StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        StudentManagement s1=new StudentManagement("Stephen",01,"CSD",21);
        StudentManagement s2=new StudentManagement("rohan",02,"AIML",22);
        StudentManagement s3=new StudentManagement("Cristeen",03,"CSE",20);
        StudentManagement s4=new StudentManagement("Mahesh",04,"IT",24);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
        s4.printDetails();



    }
}
