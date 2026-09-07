package RandomPractice.Direct;

public class Boxweight extends Box{
    double weight;

    public Boxweight() {
        this.weight = 0.5;
    }

    Boxweight(Boxweight other){
        super(other);//when we create an object with the reference it self object it calls the constructor which is from the base class ,
        // cause since we using the super class in this it call the constructor old from
        // the base class and as we know the base class has only it's properties
        this.weight= weight;
    }

    Boxweight(double side,double weight){
        super(side);
        this.weight=weight;
    }

    public Boxweight(double l, double h, double w, double weight) {
        //here we are aqquiring ,taking the properties which are from base class which it is derived ,using super keyword
        // and we are calling the parent class constructor ,so we are calling from the base class ,
        super(l, h, w);//**@@##$$%%&& the super class must given first after that only we can write whatever we want ,must
        // if they are not exist like if the type of constructor is not present in the base class this line give an error
        // , so we can only call the constructors which are exist in the base class
        //**** we call the above classes which the class we are derived from properties using super key word
        // .like if we have a,b,c like c from b and b from a ,now if we use super in c it got the b's properties
        // ,if the b uses super ,be get the a's properties
        //
        this.weight = weight;
        System.out.println(super.h);// we can use it like this too and use this, at the place of super ,
        // but to acces specifically like if the child and parent has the same name variables if we use this it
        // acceesses the variable from the own class ,so in times like that we can use super to specifically access the variable from base class

    }
}
