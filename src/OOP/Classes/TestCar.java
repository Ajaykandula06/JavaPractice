package OOP.Classes;

class TestCar{
    public static void main(String[] args) {
        Car c1=new Car("BMW",230,25.6);
        Car c2=new Car("Audi",220,15.9);
        Car c3=new Car("Ferrori",235,27.4);

        c1.accelerate(20);
        c1.brake(25);
        c1.refuel(10);
        c1.printStatus();
        System.out.println();

        c2.accelerate(30);
        c2.brake(40);
        c2.refuel(15);
        c2.printStatus();
        System.out.println();

        c3.accelerate(40);
        c3.brake(15);
        c3.refuel(12);
        c3.printStatus();
        System.out.println();
    }
}

