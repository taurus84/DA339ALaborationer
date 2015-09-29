package laboration10;

import javax.swing.JOptionPane;

public class BankAccount {
	private String accountNbr;
	private double balance;
	private double interestRate;
	
	public void init(String accountNbr, double balance, double interestRate){
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public void deposit(double amount){
		this.balance = amount + this.balance;
	}
	public void withdrawel(double cash){
		this.balance = this.balance - cash;
	}
	public void info(){
		String message = "Account number: " + accountNbr + "\n" + "Balance: " + balance;
		JOptionPane.showMessageDialog(null, message);
	}
}
