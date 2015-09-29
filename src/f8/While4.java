package f8;
import javax.swing.*;

public class While4 {
    public void example() {
        double sum=0, amount, increase;
        int weeks=0;
        
        sum = Double.parseDouble( JOptionPane.showInputDialog("Ange startkapital") );
        amount = Double.parseDouble( JOptionPane.showInputDialog("Ange slutkapital") );
        increase = Double.parseDouble( JOptionPane.showInputDialog("Ange ökning per vecka") );

        while( sum < amount ) {
            sum += increase;
            weeks++;
        }
        JOptionPane.showMessageDialog( null, "Kapitalet måste växa i " + weeks + " veckor." );
    }

    public static void main( String[] args ) {
        While4 w4 = new While4();
        w4.example();
    }
}
