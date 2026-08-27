package RandomPractice.Direct;

public class Singleton {
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getIntance(){
        // we wrote static here because we can call it through the class it self ,it does'nt need a object or an instance we can say
        //for the single ton class the object is can create only once ,even though we create multiple reference varibles
        // it simply points to the first object,they points to the same one object which created first
        if(instance == null){
            instance =new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {

        Singleton obj1=Singleton.getIntance();
        Singleton obj2=Singleton.getIntance();

        System.out.println(obj1== obj2);
    }

}

