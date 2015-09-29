package f7;
import javax.swing.*;

public class Savings {
    public void save() {
        int amount,weeks,sum;
        
        amount = Integer.parseInt( JOptionPane.showInputDialog( "Hur mycket sparar du var vecka?" ) );
        weeks = Integer.parseInt( JOptionPane.showInputDialog( "Hur många veckor sparar du?" ) );
        sum = weeks * amount;
        JOptionPane.showMessageDialog( null, "Efter " + weeks + " veckor har du " + sum + " kr." );
    }
}



/*
public class Savings {
    public void save() {
        int amount,weeks,sum;
        String res = "";

        amount = Integer.parseInt( JOptionPane.showInputDialog( "Hur mycket sparar du var vecka?" ) );
        weeks = Integer.parseInt( JOptionPane.showInputDialog( "Hur många veckor sparar du?" ) );
        sum = weeks * amount;
        if(sum>=5000) {
            res = "Du är en duktig sparare!"+"\n";
            sum += 100;
        }
        else if(sum>=2500) {
            res = "Du är en duktig sparare!"+"\n";
            sum += 50;
        }
        else {
            res = "Du är ej bra på att spara!"+"\n";
        }
        JOptionPane.showMessageDialog( null, res + "Efter " + weeks + " veckor har du " + sum + " kr." );
      }
  }
  */
