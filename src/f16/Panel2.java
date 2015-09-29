package f16;
import java.awt.*;    // Color, Dimension
import javax.swing.*; // JFrame, JPanel, JLabel, JButton, BorderFactory

public class Panel2 extends JPanel {
    private JPanel panel = new JPanel( new BorderLayout() ); // Panel med BorderLayout
    private JLabel label = new JLabel( "Mitt namn är Rolf" );
    private JButton btnCyan = new JButton( "Ljusblå" );
    private JButton btnMagenta = new JButton( "Lila" );
    private JButton btnExit = new JButton( "Avsluta" );

    public Panel2() {
        setLayout( new GridLayout(2,2) ); // Huvudpanel med GridLayout
        setPreferredSize( new Dimension( 400, 300 ) );
        
        label.setBorder( BorderFactory.createLineBorder( Color.red ) );
        btnCyan.setBackground( Color.CYAN );
        btnMagenta.setBackground( Color.MAGENTA );
        
        panel.setBorder( BorderFactory.createRaisedBevelBorder() );
        panel.add( btnMagenta, BorderLayout.NORTH );
        panel.add( btnExit, BorderLayout.WEST );
        panel.add( btnCyan, BorderLayout.SOUTH );
        panel.add( label, BorderLayout.CENTER );
        
        add( new JButton("1") );
        add( panel );
        add( new JButton("3"));
        add( new JButton("4"));
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame( "Panel2" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add( new Panel2() );
        frame.pack();
        frame.setVisible( true );
    }
}
