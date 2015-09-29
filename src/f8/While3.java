package f8;
import javax.swing.*;

public class While3 {
    public void exmple() {
        double nbr,sum=0;
        
        nbr = Double.parseDouble( JOptionPane.showInputDialog("Ange ett tal (noll eller negativt för avbrott): ") );
        while(nbr>0) {
            sum = sum + nbr;
            nbr = Double.parseDouble( JOptionPane.showInputDialog("Ange ett tal (noll eller negativt för avbrott): ") );
        }
        JOptionPane.showMessageDialog( null, "Summan av talen är " + sum );
    }

    public static void main( String[] args ) {
        While3 w3 = new While3();
        w3.exmple();
    }
}
