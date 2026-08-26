package StudentManagementSystem;

public class StudentManagement {
    String name;
    int id;
    String course;
    int age;


    StudentManagement(String name,int id,String course,int age){
        this.name=name;
        this.id=id;
        this.course=course;
        this.age=age;
    }

     void UpdateName(String name){
        this.name=name;
     }

     void UpdateCourse(String course){
        this.course=course;
     }

     void UpdateAge(int age){
        this.age=age;
     }

    void printDetails(){
        System.out.print("name: "+this.name + " , ");
        System.out.print("age: "+this.age + " , ");
        System.out.print("id: "+this.id + " ,");
        System.out.print("course: "+this.course + " .");
        System.out.println();
    }


    }





