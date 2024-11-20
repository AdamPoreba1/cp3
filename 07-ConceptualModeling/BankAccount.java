public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw (double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds, cannot withdraw: " + amount);
        } else if (amount > 500) {
            System.out.println("Withdraw limit exceeded, maximum withdrawal is 500PLN");
        } else {
            balance -= amount;
        }
        
    }

    public void displayBalance() {
        System.out.println("Current balance: PLN " + balance);
    }
}