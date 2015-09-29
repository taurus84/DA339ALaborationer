package f7;
import javax.swing.JOptionPane;

public class If1 {
    public void ifSats1() {
        String name;
        name = JOptionPane.showInputDialog( "Ange ditt namn" );
        if( name.equals( "Sture" ) ) {
            JOptionPane.showMessageDialog( null, "Grattis på namnsdagen!" );
        }
    }
}
