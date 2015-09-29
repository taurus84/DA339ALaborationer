package laboration16;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SurveyPanel extends JPanel implements ActionListener {		//ärver JPanel och implementerar ActioListener
	
	private JPanel pnlNorth = new JPanel(new BorderLayout()); 			//skapar två JPanel med borderLayout
	private JPanel pnlNorthNorth = new JPanel(new BorderLayout()); 
	private JPanel pnlNorthCenter = new JPanel(new GridLayout(1,2)); 	//skapar tre Jpanel med Gridlayout
	private JPanel pnlAge = new JPanel(new GridLayout(5,1)); 
	private JPanel pnlHobby = new JPanel(new GridLayout(5,1));
	private JTextArea taSummary = new JTextArea();						//skapar en JTextArea 
	private JButton btnSummary = new JButton( "Sammanfattning" );		//skapar en JButton som ska ligga i pnlNorth
	private JLabel lblName = new JLabel( "Namn: " ); 					//skapar en JLabel som ska ligga i panelen pnlNorthNorth
	private JTextField tfName = new JTextField();						//skapar en TextField som ska ligga i panelen pnlNorthNorth
	private JRadioButton rb0_17 = new JRadioButton( " 0 - 17" );		//skapar RadioButtons som ska ligga i panelen pnlAge
	private JRadioButton rb18_64 = new JRadioButton( "18 - 64" );
	private JRadioButton rb65 = new JRadioButton( "65 -" );
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox cbSport = new JCheckBox( "Idrott" ); 				//skapar Checkboxes som ska ligga i panelen 
	private JCheckBox cbDance = new JCheckBox( "Folkdans" ); 
	private JCheckBox cbBirds = new JCheckBox( "Fågelskådning" ); 
	private JCheckBox cbBridge = new JCheckBox( "Bridge" ); 
	private JCheckBox cbSong = new JCheckBox( "Körsång" );
	
	
	public SurveyPanel (){
		setPreferredSize( new Dimension(300,600) ); 
		setLayout( new BorderLayout() );
	
		pnlAge.setBorder( BorderFactory.createTitledBorder( "Ålder" ) );	//panelen pnlAge får en titel
		buttonGroup.add( rb0_17 );									//buttonGroup används för att man inte ska kunna välja fler val samtidigt
		buttonGroup.add( rb18_64 ); 
		buttonGroup.add( rb65 ); 
		pnlAge.add( rb0_17 ); 										//lägger till buttons i pnlAge
		pnlAge.add( rb18_64 ); 
		pnlAge.add( rb65 ); 
		rb65.setSelected(true);
		
		pnlHobby.setBorder( BorderFactory.createTitledBorder( "Hobby" ) );	//panelen pnlHobby får en titel
		pnlHobby.add( cbSport ); 									//lägger till Checboxes i pnlHobby
		pnlHobby.add( cbDance ); 
		pnlHobby.add( cbBirds ); 
		pnlHobby.add( cbBridge ); 
		pnlHobby.add( cbSong );
		
		
		pnlNorthNorth.add( lblName, BorderLayout.WEST);				//lägg till lblName i panelen pnlNorthNorth som ligger i panelen pnlNorth
		pnlNorthNorth.add( tfName, BorderLayout.CENTER);			//lägg till tfName i panelen pnlNorthNorth som ligger i panelen pnlNorth
		pnlNorthCenter.add(pnlAge);									//lägg till pnlAge som ska ligga i panelen pnlNorthCenter
		pnlNorthCenter.add(pnlHobby);								//lägg till pnlHobby som ska ligga i panelen pnlNorthCenter
		
		pnlNorth.add( pnlNorthNorth, BorderLayout.NORTH);			//lägg till pnlNorthNorth i panelen pnlNorth längst upp
		pnlNorth.add( pnlNorthCenter, BorderLayout.CENTER);			//lägg till pnlNorthCenter i panelen pnlNorth i center
		pnlNorth.add( btnSummary, BorderLayout.SOUTH);				//lägg till button btnSummary i panelen pnlNorth längst ner
		add( pnlNorth, BorderLayout.NORTH);							//lägg till pnlNorth i huvudpanel
		
		
		add( taSummary, BorderLayout.CENTER);						//lägg till taSummary i huvudpanel
		btnSummary.addActionListener(this);							//lägg till att btnSummary ska lyssna
		}
			
		public void actionPerformed(ActionEvent e) {
			String res = tfName.getText() + "\n"; 
			// Lägg till korrekt ålder 
			if( rb0_17.isSelected() )
				res += "Ålder: " + "0 - 17 år\n"; 
			else if( rb18_64.isSelected() )
				res += "Ålder: " + "18 - 64 år\n"; 
			else
				res += "Ålder: " + "65 - år\n"; 
			// Lägg till hobbies res += "Hobby: "; 
			if( cbSport.isSelected() ) 
				res += " Idrott"; 
			if( cbDance.isSelected() )
				res += " Folkdans"; 
			if( cbBirds.isSelected() ) 
				res += " Fågelskådning"; 
			if( cbBridge.isSelected() ) 
				res += " Bridge"; 
			if( cbSong.isSelected() ) 
				res += " Körsång"; 
			res += "\n"; 
			// Visa texten i JTextArea-komponenten 
			taSummary.setText( res );
			
		}
		
		
		
		
		
	
		
		
		
		
		
		
	
}


