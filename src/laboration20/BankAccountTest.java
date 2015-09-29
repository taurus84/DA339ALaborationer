
package laboration20;
import java.util.Arrays;

import javax.swing.*;
/**
 * Programmet testar klassen BankAcccount
 * @author Rolf Axelsson
 */
public class BankAccountTest {
    public void test() {
        BankAccount account1 = new BankAccount( "399.847.500" );
        BankAccount account2 = new BankAccount( "399.847.555", 1000, 0.0395 );
        account1.deposit( 1000 );
        
        account1.info();
        account1.deposit( 250 );
        JOptionPane.showMessageDialog( null, "Konto med " + account1.getBalance() + " kr\nRäntesatsen är " + account1.getInterestRate()*100 + " % per år" );
        account1.withdrawal( 550 );
        account1.info();
        
        account2.info();
        account2.deposit( 500 );
        JOptionPane.showMessageDialog( null, "Konto med " + account2.getBalance() + " kr\nRäntesatsen är " + account2.getInterestRate()*100 + " % per år" );
        account2.withdrawal( 200 );
        account2.info();
    }

    public static void main(String[] args) {
//        BankAccountTest prog = new BankAccountTest();
//        prog.test();
    	BankAccount[] accounts = new BankAccount[ 5 ];
    	String res = "";
    	accounts[ 0 ] = new BankAccount( "28397652", 5000, 0.01 ); 
    	accounts[ 1 ] = new BankAccount( "78537465", 3000, 0.02 ); 
    	accounts[ 2 ] = new BankAccount( "19567835", 15000, 0.015 ); 
    	accounts[ 3 ] = new BankAccount( "48728775", 11000, 0.002 ); 
    	accounts[ 4 ] = new BankAccount( "46786562", 4000, 0.003 ); 
    	Arrays.sort( accounts );
    	for( int i = 0; i < accounts.length; i++ ) {
    	    res += "Konto: " + accounts[ i ].getAccountNbr() +
    	           ", saldo = " + accounts[ i ].getBalance() +
    	           ", ränta = " + accounts[ i ].getInterestRate() + "\n"; 
    	}
    	JOptionPane.showMessageDialog( null, res );
    }	
}
