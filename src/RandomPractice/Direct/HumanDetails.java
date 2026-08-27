package RandomPractice.Direct;

public class HumanDetails {
    public static void main(String[] args) {

        Human h1=new Human(21,"Garret",25000,false);
        Human h2=new Human(23,"Dean",20000,true);

        System.out.println(h1.name);
        System.out.println(h2.name);

        System.out.println(Human.population);//we are accessing the static variable directly using class ,it's only related to class

    }
}
