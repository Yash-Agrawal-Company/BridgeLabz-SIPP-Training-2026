public class BankAccount {
    private static int totalAccountsCreated = 0;

    private String accountNumber;
    private String holder;
    private double balance;

    public BankAccount(String accountNumber, String holder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = initialBalance;
        totalAccountsCreated++;
    }

    public static int getTotalAccountsCreated() {
        return totalAccountsCreated;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited $" + amount + " | Balance: $" + balance);
        }
    }

    public void withdraw(double amount, double overdraftLimit) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println(holder + " withdrew $" + amount + " | Balance: $" + balance);
        } else {
            System.out.println("Withdrawal rejected for " + holder + ": Overdraft limit exceeded.");
        }
    }

    public void getStatement() {
        System.out.println("[STATEMENT] Account: " + accountNumber + " | Holder: " + holder + " | Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC-001", "Alice", 500.0);
        BankAccount acc2 = new BankAccount("ACC-002", "Bob", 1000.0);
        BankAccount acc3 = new BankAccount("ACC-003", "Charlie", 250.0);

        System.out.println("Total accounts created: " + BankAccount.getTotalAccountsCreated());

        // 5 transactions each
        acc1.deposit(100.0);
        acc1.withdraw(200.0, 100.0);
        acc1.deposit(50.0);
        acc1.withdraw(500.0, 100.0);
        acc1.getStatement();

        acc2.withdraw(300.0, 0.0);
        acc2.deposit(150.0);
        acc2.withdraw(900.0, 200.0);
        acc2.deposit(400.0);
        acc2.getStatement();

        acc3.deposit(500.0);
        acc3.withdraw(700.0, 50.0);
        acc3.withdraw(100.0, 50.0);
        acc3.deposit(200.0);
        acc3.getStatement();
    }
}