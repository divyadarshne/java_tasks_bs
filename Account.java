 public abstract class Account {
    int accountNumber;
    String customerName;
    double balance;
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
     
     public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Divya", 5000);
        CurrentAccount ca = new CurrentAccount(202, "ragu", 2000);
    sa.displayAccountInfo();
    sa.deposit(500);
    sa.withdraw(1000);

    ca.displayAccountInfo();
    ca.deposit(1000);
    ca.withdraw(2000);
    
    }

}

 class SavingsAccount extends Account{
private final double MinBalance = 1000;

public SavingsAccount(int accountNumber, String customerName, double balance) {
    super(accountNumber, customerName, balance);
}
public void withdraw(double amount){
    if(balance > (amount + MinBalance)){
        balance-=amount;
        System.out.println( "withdarwl amount: "+ amount);
        System.out.println("balance after withdrawl: "+ balance);
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
        balance-=amount;
        System.out.println( "withdarwl amount: "+ amount);
        System.out.println("balance after withdrawl: "+ balance);
    }

    public String getAccountType() {
        return "Current Account";

    }
}

 


