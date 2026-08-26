package OOP.Classes;

public class Shape {
    String colour;

    Shape(String colour){
        this.colour=colour;
    }
     double getArea(){
        return 0;
     }
}

class Circle extends Shape{
    double radius;

    Circle(String colour,double radius){
        super(colour);
        this.radius=radius;
    }

    @Override
    double getArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(String colour,double width,double height){
        super(colour);
        this.width=width;
        this.height=height;
    }

    @Override
    double getArea(){
        return width*height;
    }
}
