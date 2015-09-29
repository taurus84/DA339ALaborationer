package laboration15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class ColorPanel extends JPanel{
	
	private Random rand = new Random();
	private JLabel lblChoose = new JLabel( "Välj färg" );
	private JRadioButton rbRed = new JRadioButton("Röd");
	private JRadioButton rbBlue = new JRadioButton("Blå");
	private JRadioButton rbGreen = new JRadioButton("Grön");
	private JRadioButton rbRandom = new JRadioButton("Slump");
	private Font fontLabels = new Font( "SansSerif", Font.PLAIN, 18 );	

	
		
	
	public ColorPanel(){
		setPreferredSize(new Dimension(200,175));		//anger ny storlek på panelen
	
		
		lblChoose.setPreferredSize( new Dimension( 180,20 ));
		rbRed.setPreferredSize( new Dimension( 100, 20 ) );
		rbBlue.setPreferredSize( new Dimension( 100, 20 ) );
		rbGreen.setPreferredSize( new Dimension( 100, 20 ) );
		rbRandom.setPreferredSize( new Dimension( 100, 20 ) );
		
		lblChoose.setFont(fontLabels);	
		rbRed.setFont(fontLabels);	
		rbBlue.setFont(fontLabels);	
		rbGreen.setFont(fontLabels);	
		rbRandom.setFont(fontLabels);	
		
		ButtonGroup group = new ButtonGroup();
		add(lblChoose);
		add(rbRed);
		add(rbBlue);
		add(rbGreen);
		add(rbRandom);
		group.add( rbRed );
		group.add( rbBlue );
		group.add( rbGreen );
		group.add( rbRandom );
		
		ColorListener listener = new ColorListener();
		rbRed.addActionListener( listener );
		rbBlue.addActionListener( listener );
		rbGreen.addActionListener( listener );
		rbRandom.addActionListener( listener );
		
		
	}
	  private class ColorListener implements ActionListener {
         
		  
		  public void actionPerformed(ActionEvent e) {
              if (rbRed.isSelected()==true) {
                  setBackground(Color.RED);
              } else if (rbGreen.isSelected()==true) {
                  setBackground(Color.GREEN);
              } else if (rbBlue.isSelected()==true) {
                  setBackground(Color.BLUE);
              } else if (rbRandom.isSelected()==true) {
                  Color color = new Color(rand.nextInt(256), rand.nextInt(256),rand.nextInt(256));
                  setBackground(color);
              }
          
		  }
	  }
		  

	
	public static void main(String [] args) {
		ColorPanel panel = new ColorPanel();
		JOptionPane.showMessageDialog(null, panel);
	}
	  
	
}
	  
