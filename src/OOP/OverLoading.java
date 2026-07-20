package OOP;

public class OverLoading {
    public static void main(String[] args) {
        num call=new num();
        call.Student1("David ,");
        call.Student1(116);
    }

}

class Details{
    void Student1(String name){
        System.out.println("Hallo, Ich bin " + name);
    }
}

class num extends Details{

    void Student1(int num) {
        System.out.println("mein number: " + num);
    }
}
