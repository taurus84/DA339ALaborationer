package f15;
import javax.swing.*;
import java.awt.*;

public class Application2Panel extends JPanel {
    private JLabel  lblText = new JLabel( "Jag visar en text" );
    private JButton btnExit = new JButton( "Avsluta" );
    private Font font = new Font( "SansSerif", Font.BOLD, 14 );
    
    public Application2Panel() {
        setPreferredSize( new Dimension(200,150) );
        setBackground( Color.BLACK );
        
        lblText.setForeground( Color.BLUE );                 // Textens färg
        lblText.setFont( font );                             // Typsnitt för texten
        
        btnExit.setPreferredSize( new Dimension(120,40) );   // Knappens storlek
        btnExit.setForeground( new Color( 50, 184, 198 ) );  // Textens färg
        btnExit.setBackground( Color.RED );                  // Knappens färg
        
        add( lblText );
        add( btnExit );
    }
    
    public static void main(String[] args) {
		Application2Panel panel = new Application2Panel();
		JOptionPane.showMessageDialog( null, panel );
	}
}
