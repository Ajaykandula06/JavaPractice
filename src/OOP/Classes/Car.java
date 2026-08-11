package OOP.Classes;

public class Car {
    String brand;
    int speed;
    double fuel;

    Car(String brand,int speed,double fuel){
        this.brand=brand;
        this.speed=speed;
        this.fuel=fuel;
    }

    void accelerate(int amount){
        speed+=amount;
        System.out.println("Car Accelerated! , curremt speed: " + speed + "km/h");

    }

    void brake(int amount){
        speed = Math.max(0,speed-amount);
        System.out.println("Car braked!, Currenet speed: " + speed + "km/h");

    }

    void refuel(int amount){
        fuel+=amount;
        System.out.println("Car refueled!, Current Fuel: " + fuel + "L");
    }

    void printStatus(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + "km/h");
        System.out.println("Fuel: " + fuel + "L");
    }
}

