package RandomPractice.Direct;

public class Box {
    double l;
    double h;
    double w;
//super class for all classes is object class

    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }

    Box(double l,double h,double w){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;
    }

}
