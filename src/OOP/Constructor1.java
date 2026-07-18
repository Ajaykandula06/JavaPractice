package OOP;


class Books{
    private String name;
    private String booktype;
    private int number;

    Books(String name,String type,int num){
        this.name=name;
        this.booktype=type;
        this.number=num;
    }

    public void setName(String s){
        this.name=s;
    }

    public String getName(){
        return this.name;
    }

    public String getBooktype() {
        return booktype;
    }

    public int getNumber(){
        return this.number;
    }

}


public class Constructor1 {
    public static void main(String[] args) {
        Books details=new Books("Habits","SelfAwarness",10543);
        System.out.println("BookName: " + details.getName());
        System.out.println("Type: " + details.getBooktype());
        System.out.println("bookNumber: " + details.getNumber());
    }

}
