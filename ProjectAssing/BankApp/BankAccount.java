package ProjectAssing.BankApp;

//import javax.naming.InsufficientResourcesException;

public class BankAccount {
    private int accountNumber;
    private String accountHoldersName;
    private String accountType;
    private double balance;

    public BankAccount(int accountNumber,String accountHoldersName, String accountType,double balance){
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolderName(){
        return accountHoldersName;
    }

    public void deposit(double amount){
        balance += amount;

    }

     public void withdraw(double amount) throws insufficientBalanceException {

        if (amount > balance) {
            throw new insufficientBalanceException("Insufficient Balance");
        }

        balance -= amount;
    }

    public void displayDetails(){


        System.out.println("------------------------------");
        System.out.println("Account No      :" + accountNumber);
        System.out.println("Name            :" + accountHoldersName );
        System.out.println("Type            : "  + accountType);
        System.out.println("Balance       :Rs."+ balance); 
    } 



}
