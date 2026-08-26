package OOP.Classes;

import org.w3c.dom.css.Rect;

public class TestShape {
    public static void main(String[] args) {

         Circle c=new Circle("Green",2.5);
        System.out.println("Circle");
        System.out.println("colour: " + c.colour);
        System.out.println("Area: " + c.getArea());
        System.out.println();

        Rectangle r=new Rectangle("Blue",4.0,5.0);
        System.out.println("Rectangle");
        System.out.println(r.colour);
        System.out.println(r.getArea());
        System.out.println();

        Shape s1= new Circle("Black",3.6);
        Shape s2= new Rectangle("yellow",6,7);

        System.out.println("Circle");
        System.out.println("colour: "+s1.colour);
        System.out.println("Area: "+ s1.getArea());
        System.out.println();

        System.out.println("Rectangle");
        System.out.println("colour: " + s2.colour);
        System.out.println("Area: " + s2.getArea());
    }
}
