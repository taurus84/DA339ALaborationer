package laboration15;
import javax.swing.*; 

import java.awt.*; 
import java.awt.event.*;

public class CalcPanel extends JPanel implements ActionListener{   //klassen ska ärva JPanel. Implementerar ActionListener 

	private JLabel lblNbr1 = new JLabel( "Tal 1" );							//Skapar en ny instansvariabel av typen JLabel
	private JLabel lblNbr2 = new JLabel( "Tal 2" );	
	private JLabel lblResult = new JLabel( "Resultat" );	
	private Font fontLabels = new Font( "SansSerif", Font.PLAIN, 18 );		//Skapar en ny instansvariable av typen Font
	private JTextField tfNbr1 = new JTextField();							//skapar en textfield tfNbr1
	private JTextField tfNbr2 = new JTextField();
	private JButton btnAdd = new JButton( "+" );							//lägger till en JButton btnAdd. Det som syns i knappen är ett + tecken
	private Font fontButtons = new Font( "SansSerif", Font.PLAIN, 24 );
	private JButton btnSub = new JButton( "-" );	
	
	
	public CalcPanel (){
		setPreferredSize(new Dimension(250,105));		//anger ny storlek på panelen
		lblNbr1.setPreferredSize( new Dimension( 100, 20 ) );				//sätter storleken/dimension på JLabeln lblNbr1
		lblNbr1.setFont(fontLabels);										//sätter en font till texten
		add(lblNbr1);														//lägger till lblNrb1 i panelen
	
		
		tfNbr1.setPreferredSize( new Dimension( 100, 20 ) );				//sätter dimension på tfNbr1
		add( tfNbr1 );														//lägger till tfNbr1 i panelen
	

		lblNbr2.setPreferredSize( new Dimension( 100, 20 ) );
		lblNbr2.setFont(fontLabels);
		add(lblNbr2);
		
		tfNbr2.setPreferredSize( new Dimension( 100,20) );
		add( tfNbr2 );
		
		btnAdd.setPreferredSize( new Dimension( 100, 20 ) );				//sätter dimension på knappen btnAdd		
		btnAdd.setFont( fontButtons );										//sätter fonten på knapp-texten
		add( btnAdd );														//lägger till btnAdd i panelen
		
		btnSub.setPreferredSize( new Dimension( 100, 20 ) );
		btnSub.setFont( fontButtons );
		add( btnSub );	
		
		lblResult.setPreferredSize( new Dimension( 200, 20 ) );
		lblResult.setFont(fontLabels);
		add(lblResult);
		
		btnAdd.addActionListener( this );
		btnSub.addActionListener( this );
		
	}
	public void actionPerformed(ActionEvent e) { 
		double nbr1, nbr2; 
		String nbr1Str, nbr2Str, res; 
		nbr1Str = tfNbr1.getText(); 
		nbr2Str = tfNbr2.getText(); 
		nbr1 = Double.parseDouble( nbr1Str ); 
		nbr2 = Double.parseDouble( nbr2Str ); 
		if( e.getSource() == btnAdd ) { 
			res = nbr1Str + " + " + nbr2Str + " = " + (nbr1 + nbr2); 
			lblResult.setText( res ); 
		} else if( e.getSource() == btnSub ) { // skapa lämplig sträng att visa // visa strängen i resultat-labeln.
			res = nbr1Str + " - " + nbr2Str + " = " + (nbr1 - nbr2); 
			lblResult.setText( res ); 
			
		}
	}
	
	
	
	
}
