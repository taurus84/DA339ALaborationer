package f7;
import javax.swing.*;

public class If3 {
    public void liquorStore() {
        int age;
        String ageStr;
        
        ageStr = JOptionPane.showInputDialog( "Ange ålder" );
        age = Integer.parseInt( ageStr );
        if(age>=20)
            JOptionPane.showMessageDialog( null, "Vad önskas?" );
        else {
            JOptionPane.showMessageDialog( null, "Ni är för ung för att handla! " +
                                                 "Välkommen tillbaka om " + (20-age) + " år" );
        }
    }
}
