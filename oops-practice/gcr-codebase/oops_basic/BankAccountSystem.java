public class BankAccountSystem {
    private static String bankName = "Global Federal Bank";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;

    public BankAccountSystem(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static String getBankName() {
        return bankName;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof BankAccountSystem) {
            BankAccountSystem account = (BankAccountSystem) obj;
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + account.accountNumber);
            System.out.println("Account Holder: " + account.accountHolderName);
        } else {
            System.out.println("Invalid BankAccount object.");
        }
    }

    public static void main(String[] args) {
        BankAccountSystem acc1 = new BankAccountSystem("ACC-1001", "Alice Vance");
        BankAccountSystem acc2 = new BankAccountSystem("ACC-1002", "Bob Smith");

        acc1.displayDetails(acc1);
        acc2.displayDetails(acc2);

        System.out.println("Total Accounts: " + BankAccountSystem.getTotalAccounts());
    }
}