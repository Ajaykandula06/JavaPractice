package OOP.Classes;

public class Phone {
    String brand;
    int price;


    Phone(){
        this.brand="Oppo";
        this.price=27000;
    }

    Phone(String brand){
        this.brand=brand;
    }

    Phone(String name, int price){
        this.brand=name;
        this.price=price;
    }

}
