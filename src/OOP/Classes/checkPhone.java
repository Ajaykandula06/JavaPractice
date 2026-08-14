package OOP.Classes;

public class checkPhone {
    public static void main(String[] args) {

        Phone b1=new Phone();
        System.out.println(b1.brand + " , " + b1.price);

        Phone b2=new Phone("Moto");
        System.out.println(b2.brand);

        Phone b3=new Phone("SamSung",150000);
        System.out.println(b3.brand + " , " + b3.price);
    }
}
