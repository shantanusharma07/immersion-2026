

package ProjectAssing.BankApp;

public class bankApp{
    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount(101, "Shantanu Sharma",
                        "Savings", 10000);

        BankAccount account2 =
                new BankAccount(102, "Rahul Kumar", "Current", 15000);

        account1.displayDetails();
        account2.displayDetails();

        account1.deposit(5000);

        try {
            account2.withdraw(3000);
            account1.withdraw(15000);
        } catch (insufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        account1.displayDetails();
        account2.displayDetails();
    }
}
