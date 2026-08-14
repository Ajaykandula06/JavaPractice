package OOP.Classes;

public class VisitLibrary {
    public static void main(String[] args) {

        Library habits=new Library("AtomicHabits","JamesClear",20,13);
        habits.printDetails();
        habits.borrowBook();
        System.out.println("availableCopies: "+habits.availableCopies);
        System.out.println();

        Library b2=new Library("The Alchemist","Paulo ceolho",5,0);
        b2.printDetails();
        b2.borrowBook();
        b2.returnBook();
        System.out.println("availableCopies: "+ b2.availableCopies);
        System.out.println();

        Library b3=new Library();
        b3.printDetails();
        System.out.println();

        Library b4=new Library("The NameSake","Jhumpa lahiri",3,0);
        b4.returnBook();
        b4.borrowBook();
        b4.returnBook();
        b4.printDetails();
        System.out.println();

        Library b5=new Library("AnimalFarm","George Orwell",12,7);
        b5.borrowBook();
        b5.borrowBook();
        b5.borrowBook();
        b5.borrowBook();
        b5.returnBook();
        b5.printDetails();
    }
}
