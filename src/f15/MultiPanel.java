package f15;
import javax.swing.*;
import javax.swing.event.*; // ChangeListener

import java.awt.*;
import java.awt.event.*;

public class MultiPanel extends JPanel {
	private JRadioButton rbBad = new JRadioButton( "1" );
	private JRadioButton rbNormal = new JRadioButton( "2" );
	private JRadioButton rbGood = new JRadioButton( "3" );
	private JCheckBox cbMonday = new JCheckBox( "Måndag" );
	private JCheckBox cbTuesday = new JCheckBox( "Tisdag" );
	private JCheckBox cbWednesday = new JCheckBox( "Onsdag" );
	private JCheckBox cbThursday = new JCheckBox( "Torsdag" );
	private JCheckBox cbFriday = new JCheckBox( "Fredag" );
	private JLabel lblDays = new JLabel();
	private JSlider jsWeight = new JSlider( JSlider.HORIZONTAL, 0, 150, 75 );
	private JLabel lblWeight = new JLabel( "75" );
	
	public MultiPanel() {
		setPreferredSize( new Dimension( 320, 400) );
		radioButtons();
		checkBoxes();
		slider();
		addListeners();
	}

	private void radioButtons() {
		ButtonGroup group = new ButtonGroup();
		JLabel label = new JLabel( "Hur är din hälsa? 1=dålig, 2=normal, 3=bra" );
		label.setPreferredSize( new Dimension( 280, 20 ) );
		rbBad.setPreferredSize( new Dimension( 90, 20 ) );
		rbNormal.setPreferredSize( new Dimension( 90, 20 ) );
		rbGood.setPreferredSize( new Dimension( 90, 20 ) );
		group.add( rbBad );
		group.add( rbNormal );
		group.add( rbGood );
		add( label );
		add( rbBad );
		add( rbNormal );
		add( rbGood );
	}
	
	private void checkBoxes() {
		JLabel lbl = new JLabel( "Vilka vardagar har du fysisk aktivitet?" );
		lbl.setPreferredSize( new Dimension( 280, 20 ) );
		lblDays.setPreferredSize( new Dimension( 280, 20 ) );
		add( lbl );
		add( cbMonday );
		add( cbTuesday );
		add( cbWednesday );
		add( cbThursday );
		add( cbFriday );
		add( lblDays );
	}
	
	private void slider() {
		JLabel lbl = new JLabel( "Vad väger du?" );
		jsWeight.setBackground( new Color(75,0,75) );
		lblWeight.setOpaque( true );
		add( lbl );
		add( jsWeight );
		add( lblWeight );
	}
	
	private void addListeners() {
		RadioButtonListener actionListener = new RadioButtonListener();
		rbBad.addActionListener( actionListener );
		rbNormal.addActionListener( actionListener );
		rbGood.addActionListener( actionListener );
		
		CheckBoxListener itemListener = new CheckBoxListener();
		cbMonday.addItemListener( itemListener );
		cbTuesday.addItemListener( itemListener );
		cbWednesday.addItemListener( itemListener );
		cbThursday.addItemListener( itemListener );
		cbFriday.addItemListener( itemListener );
		
		jsWeight.addChangeListener( new SliderListener() );
	}
	
	private class RadioButtonListener implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			if( rbBad.isSelected() ) {
				setBackground( Color.RED );
			} else if( rbNormal.isSelected() ) {
				setBackground( Color.BLUE );
			}else if( rbGood.isSelected() ) {
				setBackground( Color.GREEN );
			}
		}
	}
	
	private class CheckBoxListener implements ItemListener {
		public void itemStateChanged( ItemEvent e ) {
			String res = "";
			if(cbMonday.isSelected()) {
				res += "måndag ";
			}
			if(cbTuesday.isSelected()) {
				res += "tisdag ";
			}
			if(cbWednesday.isSelected()) {
				res += "onsdag ";
			}
			if(cbThursday.isSelected()) {
				res += "torsdag ";
			}
			if(cbFriday.isSelected()) {
				res += "fredag ";
			}
			lblDays.setText( res );
		}
	}
	
	private class SliderListener implements ChangeListener {
	    public void stateChanged(ChangeEvent e) {
	    	int value = jsWeight.getValue();
	    	lblWeight.setText( ""+value );
	    	jsWeight.setBackground( new Color(150-value, 0, value ) );
	    }
	}
	
	public static void main(String[] args) {
		MultiPanel panel = new MultiPanel();
		panel.setBorder( BorderFactory.createLineBorder( Color.black ) );
		JOptionPane.showMessageDialog( null, panel );
	}
}
