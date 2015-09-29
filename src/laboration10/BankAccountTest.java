package laboration10;

import javax.swing.JOptionPane;

public class BankAccountTest {
    public void action() {
        BankAccount konto = new BankAccount();
        konto.init("399.847.500", 0, 0.005);

        konto.deposit( Integer.parseInt(JOptionPane.showInputDialog("Hur mycket ska du sätta in?")) );
        konto.info();
        konto.withdrawel( Integer.parseInt(JOptionPane.showInputDialog("Hur mycket ska du ta ut?")) );
        konto.info();
    }

    public static void main(String[] args) {
        BankAccountTest bat = new BankAccountTest();
        bat.action();
    }
}
