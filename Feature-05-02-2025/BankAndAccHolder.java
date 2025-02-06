import java.util.*;
class BankAndAccHolder{
	public static void main(String[]args){
		Bank bank = new Bank("SBI");
		Customer customer = new Customer("Bhagyodaya");
		
		bank.openAccount(customer,5000.0);
		bank.openAccount(customer,8000.0);
		
		customer.viewBalance();
	}
}
class Bank{
	private String name;
	private List<Customer> customers;
	Bank(String name){
		this.name = name;
		this.customers = new ArrayList<>();
	}
	public void openAccount(Customer customer, double initialDeposit){
		BankAccount acc = new BankAccount(this,initialDeposit);
		customer.addAccount(acc);
		customers.add(customer);
	}
	public String getName(){
		return name;
	}
}
class Customer{
	private String name;
	private List<BankAccount> accounts;
	Customer(String name){
		this.name = name;
		this.accounts = new ArrayList<>();
	}
	public void addAccount(BankAccount acc){
		accounts.add(acc);
	}
	public void viewBalance(){
		for(BankAccount bankAcc : accounts)
			System.out.println("Bank: "+bankAcc.getBank().getName()+" Balance: "+bankAcc.getBalance());
	}
}
class BankAccount{
	private Bank bank;
	private double balance;
	BankAccount(Bank bank, double balance){
		this.bank = bank;
		this.balance = balance;
	}
	public Bank getBank(){
		return bank;
	}
	public double getBalance(){
		return balance;
	}
}