package OOP.Classes;

public class TestBank {
    public static void main(String[] args) {

        BankAccount a1=new BankAccount("Stanlee",23150501,15000.87);
        BankAccount a2=new BankAccount("Cristeen",23150502,76545);
        BankAccount a3=new BankAccount("Roddy",221505021,5643);

        a1.deposit(15000);
        a1.withdraw(10000);
        a1.printDetails();
        System.out.println();

        a2.withdraw(20000);
        a2.withdraw(4000);
        a2.withdraw(5000);
        a2.withdraw(60000);
        a2.printBalance();
        a2.printDetails();
        System.out.println();

        a3.printDetails();
    }
}
