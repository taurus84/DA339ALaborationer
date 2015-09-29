package f15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Application4Panel extends JPanel {
    private JLabel  lblText = new JLabel( "Jag visar en text" );
    private JButton btnExit = new JButton( "Avsluta" );
    private Font font = new Font( "SansSerif", Font.BOLD, 14 );
    
    public Application4Panel() {
        setPreferredSize( new Dimension(200,150) );
        setBackground( Color.BLACK );
        
        lblText.setForeground( Color.BLUE );                 // Textens färg
        lblText.setFont( font );                             // Typsnitt för texten
        
        btnExit.setPreferredSize( new Dimension(120,40) );   // Knappens storlek
        btnExit.setForeground( new Color( 50, 184, 198 ) );  // Textens färg
        btnExit.setBackground( Color.RED );                  // Knappens färg
        
        ActionListener listener = new AL();
        btnExit.addActionListener( listener );  // btnExit.addActionListener( new AL() );
        
        add( lblText );
        add( btnExit );
    }
    
    private class AL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	System.exit(0);
        }
    }
    
    public static void main(String[] args) {
		Application4Panel panel = new Application4Panel();
		JOptionPane.showMessageDialog( null, panel );
	}
}
