class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    int depositTerm;
    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Deposit Term: " + depositTerm + " years");
    }
}
public class bankAccountSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S743", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("A356", 30000, 10000);
        FixedDepositAccount fixed = new FixedDepositAccount("T989", 100000, 5);

        savings.displayAccountType();
        System.out.println();
        checking.displayAccountType();
        System.out.println();
        fixed.displayAccountType();
    }
}
