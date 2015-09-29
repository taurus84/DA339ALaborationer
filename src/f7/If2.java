package f7;
import javax.swing.*;

public class If2 {
    public void price() {
        String message = "";
        double discount = 0, total;
        int glue,wallpaper,knifes;

        glue = Integer.parseInt( JOptionPane.showInputDialog( "Antal liter vävlim" ) );
        wallpaper = Integer.parseInt( JOptionPane.showInputDialog( "Antal rullar tapet" ) );
        knifes = Integer.parseInt( JOptionPane.showInputDialog( "Antal tapetknivar" ) );

        total = glue*97 + wallpaper*240 + knifes*45;        
        if(total>=2000) {
            discount = 0.04*total;
            total = total-discount;
            message = "Ni erhåller "+discount+" kr i rabatt.\n";
        }
        message = message + "Ni ska betala "+total+" kr.";
        JOptionPane.showMessageDialog( null, message );
    }
}
