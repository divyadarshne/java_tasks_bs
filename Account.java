 public abstract class Account {
    private int accountNumber;
    private String customerName;
    private double balance;
    public Account(int accountNumber, String customerName, double balance){
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.balance=balance;
    }
    
    public void deposit(double amount){
        balance+=amount;
        System.out.println("credited "+ accountNumber + " "+ amount);
        System.out.println("Balance Of "+ accountNumber +" "+ balance);
    }
    public abstract void withdraw(double amount);
    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("customerName  : " + customerName);
        System.out.println("Balance       : " + balance);

    }
    public abstract String getAccountType();
   
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

 class SavingsAccount extends Account{
private final double MinBalance = 1000;

public SavingsAccount(int accountNumber, String customerName, double balance) {
    super(accountNumber, customerName, balance);
}
public void withdraw(double amount){
    if( getBalance() > (amount + MinBalance)){
        setBalance(getBalance()- amount);
        System.out.println( "withdarwl amount: "+ amount);
        System.out.println("balance after withdrawl: "+ getBalance());
    }
    else{
        System.out.println("The current balance is insuficient.");
    }
}
 public String getAccountType() {
        return "Savings Account";
}
}

 class CurrentAccount extends Account {
  
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

 


