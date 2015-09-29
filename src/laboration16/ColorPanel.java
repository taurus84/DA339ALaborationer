package laboration16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class ColorPanel extends JPanel implements ActionListener{
	
	private JLabel chooseColor = new JLabel("Välj färg");
	private JRadioButton rbRed = new JRadioButton("Röd");
	private JRadioButton rbGreen = new JRadioButton("Grön");
	private JRadioButton rbBlue = new JRadioButton("Blå");
	private JRadioButton rbRand = new JRadioButton("Slump");
	private ButtonGroup buttonGroup = new ButtonGroup();
	Random rand = new Random();
	private Controller2 controller2;	
	
	
	public ColorPanel(Controller2 controller2) {
		
		this.controller2 = controller2;
		setPreferredSize( new Dimension (300,200));
//		setLayout( new GridLayout(5,1,10,0));
		
		chooseColor.setPreferredSize(new Dimension(270,30));
		rbRed.setPreferredSize(new Dimension(270,30));
		rbGreen.setPreferredSize(new Dimension(270,30));
		rbBlue.setPreferredSize(new Dimension(270,30));
		rbRand.setPreferredSize(new Dimension(270,30));
		add(chooseColor);
		add(rbRed);
		add(rbGreen);
		add(rbBlue);
		add(rbRand);
		buttonGroup.add(rbRed);
		buttonGroup.add(rbGreen);
		buttonGroup.add(rbBlue);
		buttonGroup.add(rbRand);
		rbRed.setOpaque(true);
		rbGreen.setOpaque(true);
		rbBlue.setOpaque(true);
		rbRand.setOpaque(true);
				
		rbRed.addActionListener(this);
		rbGreen.addActionListener(this);
		rbBlue.addActionListener(this);
		rbRand.addActionListener(this);
					
	}
	public void actionPerformed (ActionEvent e){
			Color color = null;
			if (rbRed.isSelected()) {
               setBackground(Color.RED);
               color = Color.RED;
               controller2.setBg(color);
           } else if (rbGreen.isSelected()) {
               setBackground(Color.GREEN);
               color = Color.GREEN;
               controller2.setBg(color);
           } else if (rbBlue.isSelected()) {
               setBackground(Color.BLUE);
               color = Color.BLUE;
               controller2.setBg(color);
           } else if (rbRand.isSelected()) {
               Color color2 = new Color(rand.nextInt(256), rand.nextInt(256),rand.nextInt(256));
               setBackground(color2);
               controller2.setBg(color2);
           }
	}
//	public static void main(String[] args) { 
//		ColorPanel panel = new ColorPanel();
//		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		JOptionPane.showMessageDialog(null, panel);
//	}

}
