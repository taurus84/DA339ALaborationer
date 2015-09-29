package f8;
import javax.swing.*;

public class Do4 {
    public void example() {
        int choice, nbr1, nbr2;
        String message = "1. Addera\n2. Subtrahera\n3. Multiplicera\n\nVälj alternativ", res = "";
        
        // Inmatning av ett av menyalternativen
        do {
            choice = Integer.parseInt( JOptionPane.showInputDialog( message ) );
        } while( ( choice < 1 ) || ( choice > 3 ) );
        
        // inmatning av två tal och därefter resultatutskrift
        nbr1 = Integer.parseInt( JOptionPane.showInputDialog( "Ange tal 1" ) );
        nbr2 = Integer.parseInt( JOptionPane.showInputDialog( "Ange tal 2" ) );
        switch(choice) {
            case 1 : res = nbr1 + "+" + nbr2 + "=" + (nbr1 + nbr2); 
                     break;
            case 2 : res = nbr1 + "-" + nbr2 + "=" + (nbr1 - nbr2); 
                     break;
            case 3 : res = nbr1 + "*" + nbr2 + "=" + (nbr1 * nbr2); 
                     break;
        }
        JOptionPane.showMessageDialog( null, res );
    }

    public static void main( String[] args ) {
        Do4 d4 = new Do4();
        d4.example();
    }
}
