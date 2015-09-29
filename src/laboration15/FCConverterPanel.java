package laboration15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FCConverterPanel extends JPanel implements ActionListener {
	private JLabel lblGrader = new JLabel( "Grader" );	
	private JLabel lblResultat = new JLabel( "Resultat" );	
	private JButton btnToF = new JButton( "Till Fahrenheit" );
	private JButton btnToC = new JButton( "Till Celsius" );
	private JButton btnAvsluta = new JButton( "Avsluta" );
	private Font fontLabels = new Font( "SansSerif", Font.PLAIN, 18 );	
	private Font fontButtons = new Font( "SansSerif", Font.PLAIN, 24 );
	private JTextField grader = new JTextField();	
	
	
	
	
	public FCConverterPanel() {
		
		setPreferredSize(new Dimension(320,120));
		lblGrader.setPreferredSize( new Dimension( 100, 20 ) );
		grader.setPreferredSize( new Dimension( 200, 20 ) );
		lblResultat.setPreferredSize( new Dimension( 300,20));
		btnToF.setPreferredSize( new Dimension( 150, 20 ) );	
		btnToC.setPreferredSize( new Dimension( 150, 20 ) );	
		btnAvsluta.setPreferredSize( new Dimension( 306, 20 ) );	
		
		
		
		
		lblGrader.setFont(fontLabels);	
		lblResultat.setFont(fontLabels);	
		btnToF.setFont(fontLabels);	
		btnToC.setFont(fontLabels);	
		btnAvsluta.setFont(fontLabels);	
		
		btnToF.addActionListener( this );
		btnToC.addActionListener( this );
		btnAvsluta.addActionListener( this );
		
		
		add(lblGrader);
		add( grader );
		add( lblResultat );
		add( btnToF );
		add( btnToC );
		add( btnAvsluta );
		
		
	}
	
	
	


	
	
	public void actionPerformed(ActionEvent e) { 
		
		double nbr, nbr2, tal;
		String nbrStr, res;
		
		nbrStr = grader.getText();
		
		nbr = Double.parseDouble(nbrStr);
		
		if( e.getSource() == btnToF ) {
			tal = (nbr * 1.8 + 32 );
			String res1 = String.format("%1.1f", tal);				//gör om stängen till att ha x antal decimaler. bestäms efter punkten
			res = nbrStr + " C är " + res1 + " F"; 
			
			lblResultat.setText( res ); 
			
			// kod om användaren klickat på "Till Fahrenheit"
			} else if( e.getSource() == btnToC ) { 
				tal = (nbr/1.8 - 32);
				String res1 = String.format("%1.1f", tal);			//gör om stängen till att ha x antal decimaler. bestäms efter punkten
				res = nbrStr + "  F är " + res1 + " C "; 
				lblResultat.setText( res ); 
				// kod om användaren klickat på "Till Celsius" 
			} else if( e.getSource() == btnAvsluta ) { 
				System.exit( 0 ); 
			}
		
	}
	
	
	
}
