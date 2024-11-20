public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 0);
        account.deposit(500);
        account.displayBalance();
        account.deposit(200);
        account.displayBalance();
        account.withdraw(501);
        account.displayBalance();
    }
    
}
