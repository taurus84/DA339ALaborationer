package laboration20;

import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class BalanceDescending implements Comparator {

	public int compare(Object o1, Object o2) {
		BankAccount b1 = (BankAccount) o1;
		BankAccount b2 = (BankAccount) o2;
		double balance1 = b1.getBalance();
		double balance2 = b2.getBalance();
		
		if (balance1 < balance2)
			return 1;
		else if (balance1 > balance2)
			return -1;
		else
			return 0;
	}
	
	public static void main (String[] args) {
		BankAccount[] accounts = new BankAccount[ 5 ];
		String res = "";
		accounts[ 0 ] = new BankAccount( "28397652", 5000, 0.01 ); 
		accounts[ 1 ] = new BankAccount( "78537465", 3000, 0.02 ); 
		accounts[ 2 ] = new BankAccount( "19567835", 15000, 0.015 ); 
		accounts[ 3 ] = new BankAccount( "48728775", 11000, 0.002 ); 
		accounts[ 4 ] = new BankAccount( "46786562", 4000, 0.003 ); 
		Arrays.sort( accounts, new BalanceDescending() );
		for( int i = 0; i < accounts.length; i++ ) {
		    res += "Konto: " + accounts[ i ].getAccountNbr() +
		           ", saldo = " + accounts[ i ].getBalance() +
		 ", ränta = " + accounts[ i ].getInterestRate() + "\n"; 
		}    
		JOptionPane.showMessageDialog( null, res );
	}

}
