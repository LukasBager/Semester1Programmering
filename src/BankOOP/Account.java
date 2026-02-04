package BankOOP;

public class Account {

    int accountNumber;
    String accountHolder;
    double accountBalance;


    public Account(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }


    public void printAccountInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Account balance: $" + accountBalance);
    }

    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("You have withdrawn $" + amount);
            System.out.println("Your account balance is now: $" + accountBalance);
        } else if (amount > accountBalance) {
            System.out.println("The amount entered is greater than your account balance. You have not beeen charged or credited.");
        } else {
            System.out.println("An error has occurred. You have not been charged or credited.");
        }
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("You have deposited $" + amount);
        System.out.println("Your account balance is now: $" + accountBalance);
    }

}
