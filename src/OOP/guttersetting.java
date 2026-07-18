package OOP;

public class guttersetting {
    public static void main(String[] args) {
        Cse student1=new Cse();
        student1.setname("balu");
        System.out.println(student1.getName());
    }

}

class Cse{
    private String name;
    private String address;
    private int mobileNum;

    public void setname(String s){
        this.name=s;
    }

    public String getName() {
        return name;
    }
}
