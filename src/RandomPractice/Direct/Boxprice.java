package RandomPractice.Direct;

public class Boxprice extends Boxweight{
    double cost;

    Boxprice(){
        super();
        this.cost=-1;
    }

    public Boxprice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public Boxprice(Boxprice other) {
        super(other);
        this.cost = other.cost;
    }
    public Boxprice(double side,double weight,double cost){
        super(side, weight);// here it can able to access the super class properties like from the box ,
        // it works like it first got the properties form the boxweight and it cal it's parent box got from box ,
        // since boxweight has the box's properties then the boxcost can access it
        // it's multilevel inheritance
        this.cost=cost;
    }


}
