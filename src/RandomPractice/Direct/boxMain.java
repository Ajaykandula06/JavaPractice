package RandomPractice.Direct;

public class boxMain {
    public static void main(String[] args) {
        // for important we can call the properties of the base class using the child class object
        // but we cannot call the properties of child class using the base class object
         Box b1=new Box();
        System.out.println(b1.l + " " + b1.h + " " + b1.w);// we already cover these in previous examples
        //they  give the outputs based on the object and the parameters we are giving to the object


        Boxweight b2=new Boxweight(2,3,4,5);
        // now it prints the all properties of base and child class
        System.out.println(b2.l + " " + b2.h + " " + b2.weight);

        Box box1=new Boxweight(10,20,30,40);
        //so if the parent class  refers with the child class object,
        // it can only access the properties which are in the parent class, it cannot access the child class properties
        // and we cant create the object off parent with child class reference
        // cause the parent class doesn't access and doesn't know wt are the child classes exist it's below
        System.out.println(box1.h + " , " + box1.w);


        System.out.println("from this belogs to box prize");
        Boxprice box2=new Boxprice();
        System.out.println(box2.h);
        System.out.println(box2.weight);

        Boxprice box3=new Boxprice(1,2,3,4,50);
        System.out.println(box3.cost);

        Boxprice b3=new Boxprice(5,8,200);
        System.out.println(b3.weight + " , " + b3.cost + " , " + b3);
    }
}
