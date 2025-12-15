package banking.model;

import banking.exceptions.InsufficientBalanceException;

public class SavingsAccount extends Account {
     private final double MinBalance = 1000;

public SavingsAccount(int accountNumber, String customerName, double balance) {
    super(accountNumber, customerName, balance);
}
public void withdraw(double amount) throws InsufficientBalanceException{
   
    if (getBalance() - amount < MinBalance) {
        throw new InsufficientBalanceException(
            "Minimum balance of " + MinBalance + " must be maintained"
        );
    }
    
        setBalance(getBalance()- amount);
        System.out.println( "withdarwl amount: "+ amount);
        System.out.println("balance after withdrawl: "+ getBalance());
    }
     public String getAccountType() {
        return "Savings Account";
}
}
