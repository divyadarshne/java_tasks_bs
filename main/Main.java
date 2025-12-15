package banking.main;
import banking.exceptions.InsufficientBalanceException;
import banking.model.CurrentAccount;
import banking.model.SavingsAccount;


public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Divya", 5000);
        CurrentAccount ca = new CurrentAccount(202, "ragu", 2000);
    //sa.displayAccountInfo();
   // sa.deposit(500);
    //sa.withdraw(1000);

    ca.displayAccountInfo();
    ca.deposit(1000);
   // ca.withdraw(2000);

    try {
            sa.withdraw(600);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }
    }
}
