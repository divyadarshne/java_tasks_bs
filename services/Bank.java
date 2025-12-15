package banking.services;
import java.util.*;

import banking.model.Account;

public class Bank {
    private Map <Integer, Account> accounts = new HashMap<> ();
   
    public void addAccount(Account acc){     //adding account
    accounts.put(acc.getAccountNumber(), acc); 
    System.out.println("Account added: " + acc.getAccountNumber());
   } 
   public Account getAccount(int accNo){  //get the account details from the given account number
    return accounts.get(accNo);
   }
   
   public void displayAccountNumbers() {
   for (Integer accNo : accounts.keySet()) {
    System.out.println("Account No: " + accNo);
   }
}

            
}
