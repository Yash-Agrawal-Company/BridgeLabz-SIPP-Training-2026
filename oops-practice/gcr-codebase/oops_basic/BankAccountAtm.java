public class BankAccountAtm {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccountAtm(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account: " + accountNumber + " | Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccountAtm account = new BankAccountAtm("Taylor", "ACC12345", 500.0);
        account.displayBalance();
        account.deposit(200.0);
        account.withdraw(150.0);
        account.displayBalance();
    }
}