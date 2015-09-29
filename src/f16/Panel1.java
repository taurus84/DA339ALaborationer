package f16;
import java.awt.*;    // Color, Dimension
import javax.swing.*; // JFrame, JPanel, JLabel, JButton, BorderFactory

public class Panel1 extends JPanel {
    private JPanel panel = new JPanel( new GridLayout(2,2) ); // Panel med GridLayout
    private JLabel label = new JLabel( "Mitt namn är Rolf" );
    private JButton btnCyan = new JButton( "Ljusblå" );
    private JButton btnmagenta = new JButton( "Lila" );
    private JButton btnExit = new JButton( "Avsluta" );

    public Panel1() {
        setLayout( new BorderLayout() ); // Huvudpanel med BorderLayout
        setPreferredSize( new Dimension( 400, 300 ) );
        
        label.setBorder( BorderFactory.createLineBorder( Color.red ) );
        btnCyan.setBackground( Color.CYAN );
        btnmagenta.setBackground( Color.MAGENTA );
        
        panel.setBorder( BorderFactory.createRaisedBevelBorder() );
        panel.add( btnmagenta );
        panel.add( btnExit );
        panel.add( btnCyan );
        panel.add( label );
        
        add( new JLabel("WEST"), BorderLayout.WEST );
        add( new JButton("SOUTH"), BorderLayout.SOUTH );
        add( panel, BorderLayout.CENTER );
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame( "Panel1" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( new Panel1() );
        frame.pack();
        frame.setVisible( true );
    }
}
