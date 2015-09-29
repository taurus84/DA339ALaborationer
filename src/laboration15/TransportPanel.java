package laboration15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TransportPanel extends JPanel implements ActionListener{
	
	private JCheckBox cbCar = new JCheckBox( "Bil" );
	private JCheckBox cbTrain = new JCheckBox( "Tåg" );
	private JCheckBox cbBus = new JCheckBox( "Buss" );
	private JCheckBox cbBike = new JCheckBox( "Cykel" );
	private JCheckBox cbWalk = new JCheckBox( "Går" );
	private JLabel lblQ = new JLabel( "Hur tar du dig till MAH?" );
	private JLabel lblA = new JLabel( "Du använder:" );
	private Font fontLabels = new Font( "SansSerif", Font.PLAIN, 14 );	
	
	public TransportPanel(){
		setPreferredSize(new Dimension(400,60));
		setBackground(Color.CYAN);   
		
		lblQ.setPreferredSize( new Dimension( 400, 15 ) );
		lblA.setPreferredSize( new Dimension( 400, 15 ) );
		cbCar.setPreferredSize( new Dimension( 70, 18 ) );
		cbTrain.setPreferredSize( new Dimension( 70, 18 ) );
		cbBus.setPreferredSize( new Dimension( 70, 18 ) );
		cbBike.setPreferredSize( new Dimension( 70, 18 ) );
		cbWalk.setPreferredSize( new Dimension( 70, 18 ) );
		
		lblQ.setFont(fontLabels);
		lblA.setFont(fontLabels);
		cbCar.setFont(fontLabels);
		cbTrain.setFont(fontLabels);
		cbBus.setFont(fontLabels);
		cbBike.setFont(fontLabels);
		cbWalk.setFont(fontLabels);
		
		add(lblQ);
		add(cbCar);
		add(cbTrain);
		add(cbBus);
		add(cbBike);
		add(cbWalk);
		add(lblA);
		
		cbCar.addActionListener( this );
		cbTrain.addActionListener( this );
		cbBus.addActionListener( this );
		cbBike.addActionListener( this );
		cbWalk.addActionListener( this );
		
	}
	public void actionPerformed(ActionEvent e) { 
		
		String res = "";
		if (cbCar.isSelected()==true) {
			res += " bil";
		 }
		 if (cbTrain.isSelected()==true) {
			 res += " tåg";
		 }
		 if (cbBus.isSelected()==true) {
			 res += " buss";
		 }
		 if (cbBike.isSelected()==true) {
			 res += " cykel";
		 }
		 if (cbWalk.isSelected()==true) {
			 res += " går";
		 }
		 lblA.setText("Du använder:" + res);
		 
	}
	
	
	
	public static void main(String [] args) {
		TransportPanel panel = new TransportPanel();
		JOptionPane.showMessageDialog(null, panel);
	}

}
