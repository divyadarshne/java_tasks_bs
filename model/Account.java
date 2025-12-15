package banking.model;
import banking.exceptions.InsufficientBalanceException;

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
    public abstract void withdraw(double amount) throws  InsufficientBalanceException;

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
  




 


