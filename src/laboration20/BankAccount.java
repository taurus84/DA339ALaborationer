package laboration20;

import javax.swing.JOptionPane;

public class BankAccount implements Comparable {
	private String accountNbr;
	private double balance;
	private double interestRate;

	public BankAccount(String accountNbr) {
		this.accountNbr = accountNbr;
		this.interestRate = 0.005;
	}

	public BankAccount(String accountNbr, double balance, double interestRate) {
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccountNbr() {
		return accountNbr;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void withdrawal(double amount) {
		this.balance = this.balance - amount;
	}

	public void info() {
		String message = "Account number: " + this.accountNbr + "\n"
				+ "Balance: " + this.balance;
		JOptionPane.showMessageDialog(null, message);
	}

	public int compareTo(Object o) {
		double balance;
		BankAccount saldo = (BankAccount) o;
		balance = saldo.getBalance(); 
			if (this.balance < balance)
				return -1;
			else if (this.balance > balance)
				return 1;
			else
				return 0;
	}
}