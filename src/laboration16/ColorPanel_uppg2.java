package laboration16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class ColorPanel_uppg2 extends JPanel implements ActionListener{
	
	private JLabel chooseColor = new JLabel("Välj färg");
	private JRadioButton rbRed = new JRadioButton("Röd");
	private JRadioButton rbGreen = new JRadioButton("Grön");
	private JRadioButton rbBlue = new JRadioButton("Blå");
	private JRadioButton rbRand = new JRadioButton("Slump");
	private ButtonGroup buttonGroup = new ButtonGroup();
	Random rand = new Random();
//	private Controller2 controller;	
	
	
	public ColorPanel_uppg2() {
		
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
		   if (rbRed.isSelected()) {
               setBackground(Color.RED);
           } else if (rbGreen.isSelected()) {
               setBackground(Color.GREEN);
           } else if (rbBlue.isSelected()) {
               setBackground(Color.BLUE);
           } else if (rbRand.isSelected()) {
               Color color = new Color(rand.nextInt(256), rand.nextInt(256),rand.nextInt(256));
               setBackground(color);
           }
	}
	public static void main(String[] args) { 
		ColorPanel panel = new ColorPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JOptionPane.showMessageDialog(null, panel);
	}

}
