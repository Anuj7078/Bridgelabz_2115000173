import java.util.*;

public class BankAccount {
    private static String bankName = "Indian Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of accounts: ");
        int n = sc.nextInt();
        BankAccount[] accounts = new BankAccount[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Enter account "+(i+1)+" holder name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter "+(i+1)+" account number: ");
            int accNumber = sc.nextInt();
            
            System.out.print("Enter "+(i+1)+" initial balance: ");
            int balance = sc.nextInt();
            
            accounts[i] = new BankAccount(name, accNumber, balance);
        }

        System.out.println("Total Accounts Registered: " + getTotalAccounts());
        System.out.print("Enter Account Number to display details: ");
        int searchId = sc.nextInt();
        boolean found = false;

        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == searchId) {
                System.out.println("Account Details:");
                account.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account with Number " + searchId + " not found.");
        }

        sc.close();
    }
}
