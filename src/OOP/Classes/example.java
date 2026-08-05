package OOP.Classes;

public class example {
    public static void main(String[] args) {
        Student student1=new Student();

        Student ramya=new Student(501,"ramya",90.9f);
        //System.out.println(ramya.name);

        student1.changeName("David");
        student1.intro();
        System.out.println(student1.rollnu);
        System.out.print(student1.name);
        System.out.println(student1.marks);

        Student nijam=new Student(student1);
        System.out.println(nijam.name);

        Student random =new Student();
        System.out.println(random.name + ", rno: " + random.rollnu);
        random.intro();
        random.changeName("raju");
        random.intro();

        Student one=new Student();
        Student two=one;
        one.name="All for one";
        System.out.println(two.name);
    }
}


class  Student{
        int rollnu;
        String name;
        float marks ;

        Student(Student other){
            this.name = other.name;
            this.marks=other.marks;
            this.rollnu= other.rollnu;
        }

        Student(){
            this(501,"ajay",77);
           // this.rollnu=25;
            //this.name="Evens";
            //this.marks=87.6f;
        }

        void intro(){
            System.out.println("Hallo!, Ich bin " + name );
        }

        void changeName(String name){
           this.name=name;
        }



        Student(int num,String name,float marks){
            this.name=name;
            this.marks=marks;
            rollnu=num;
    }




}
