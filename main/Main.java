package main;
import exceptions.InsufficientBalanceException;
import model.CurrentAccount;
import model.SavingsAccount;


public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Divya", 5000);
        CurrentAccount ca = new CurrentAccount(202, "ragu", 2000);

    ca.displayAccountInfo();
    ca.deposit(1000);
   
   
    try {
            sa.withdraw(600);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }
    }
}
