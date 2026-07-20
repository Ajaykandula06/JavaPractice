package OOP;

public class OverRiding {
    public static void main(String[] args) {
        cat speak = new cat();
        speak.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Dog sounds meow meow ");
    }
}

class cat extends Animal{
    void sound(){
        System.out.println("Cat sounds meow meow");
    }
}
