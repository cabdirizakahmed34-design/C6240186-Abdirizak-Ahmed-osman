public class DemoQuestion2 {
    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account1 = new BankAccount(1001, "Ahmed", 500);

        // Display initial account info
        account1.displayAccount();

        // Deposit money
        account1.deposit(200);
        System.out.println("New Balance: $" + account1.getBalance());

        // Withdraw money
        account1.withdraw(150);
        System.out.println("Final Balance: $" + account1.getBalance());
    }
}