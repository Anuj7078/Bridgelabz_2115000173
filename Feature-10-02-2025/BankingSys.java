import java.util.*;
class BankingSys {
    public static void main(String[] args) {
        List<BankAccount> Accounts = new ArrayList<>();
        SavingsAccount savingAccount = new SavingsAccount(1, "Anuj", 60000, 9.0);
        CurrentAccount currentAccount = new CurrentAccount(2, "Aarav", 30000, 5.5);

        Accounts.add(savingAccount);
        Accounts.add(currentAccount);
        for (BankAccount bankAccount : Accounts) {
            bankAccount.displayDetails();
            System.out.println("Interest: " + bankAccount.calculateInterest());
            if (bankAccount instanceof Loanable) {
                Loanable loanableAccount = (Loanable) bankAccount;
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
                System.out.println(loanableAccount.applyForLoan());
            }
            System.out.println("*******************************************");
        }
    }
}
abstract class BankAccount {
    private int accountNumber;
    private double balance;
    private String holderName;
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    abstract double calculateInterest();
    public void displayDetails() {
        System.out.println("Bank Account Number: " + accountNumber);
        System.out.println("Bank Account Holder Name: " + holderName);
        System.out.println("Bank Account Balance: " + balance);
    }
    public double getAccountBalance() {
        return balance;
    }
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println(amt + " Rs. Deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println(amt + " Rs. Withdrawn.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    double calculateInterest() {
        return getAccountBalance() * (interestRate / 100);
    }
    public String applyForLoan() {
        return "Savings Account Loan: Up to 60% of balance.";
    }
    public double calculateLoanEligibility() {
        return getAccountBalance() * 0.6;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate;
    CurrentAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    double calculateInterest() {
        return getAccountBalance() * (interestRate / 100);
    }
    public String applyForLoan() {
        return "Current Account Loan: Up to 20% of balance.";
    }
    public double calculateLoanEligibility() {
        return getAccountBalance() * 0.2;
    }
}
interface Loanable {
    String applyForLoan();
    double calculateLoanEligibility();
}