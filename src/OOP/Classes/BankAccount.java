package OOP.Classes;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String name, int num, double bal) {
        this.accountHolder = name;
        this.accountNumber = num;
        this.balance = bal;
    }

    void deposit(int amount) {
        System.out.println(amount + ".Rs Credited to " + accountNumber);
        balance+=amount;
    }

    void withdraw(int amount){
        if(amount>balance){
            System.out.println("Incefiecient Funds!");
        }else{
            System.out.println(amount + ".Rs debited from " + accountNumber);
            balance-=amount;
        }
    }

    void printBalance(){
        System.out.println("Account current Balance: " + balance + ".Rs");
    }

    void printDetails(){
        System.out.println("Name: " + accountHolder);
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("Balance: " + balance + ".Rs");
    }
}
