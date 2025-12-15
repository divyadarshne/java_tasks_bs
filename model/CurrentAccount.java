package src.banking.model;
    
 public class CurrentAccount extends Account {
  
    public CurrentAccount(int accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    public void withdraw(double amount){
        setBalance(getBalance()- amount);
        System.out.println( "withdarwl amount: "+ amount);
        System.out.println("balance after withdrawl: "+ getBalance());
    }

    public String getAccountType() {
        return "Current Account";

    }
}

