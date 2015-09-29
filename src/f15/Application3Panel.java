package f15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Application3Panel extends JPanel implements ActionListener {
    private JLabel  lblText = new JLabel( "Jag visar en text" );
    private JButton btnExit = new JButton( "Avsluta" );
    private Font font = new Font( "SansSerif", Font.BOLD, 14 );
    
    public Application3Panel() {
        setPreferredSize( new Dimension(200,150) );
        setBackground( Color.BLACK );
        
        lblText.setForeground( Color.BLUE );                 // Textens färg
        lblText.setFont( font );                             // Typsnitt för texten
        
        btnExit.setPreferredSize( new Dimension(120,40) );   // Knappens storlek
        btnExit.setForeground( new Color( 50, 184, 198 ) );  // Textens färg
        btnExit.setBackground( Color.RED );                  // Knappens färg
        
        btnExit.addActionListener( this );
        
        add( lblText );
        add( btnExit );
    }
    
    public void actionPerformed(ActionEvent e) {
    	System.exit(0);
    }
    
    public static void main(String[] args) {
		Application3Panel panel = new Application3Panel();
		JOptionPane.showMessageDialog( null, panel );
	}
}
