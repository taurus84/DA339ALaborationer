package laboration22;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class TestTitle extends JPanel {
	
	private Title titelNorth = new Title("Rött och svart", Font.BOLD, 26, Color.RED, Color.BLACK);
	private Title titelCenter = new Title("Blå text - gul bakgrund", Font.PLAIN, 20, Color.BLUE, Color.YELLOW);
	private Title titelSouth = new Title("Denna rubrik är i south", Font.ITALIC, 16, Color.WHITE, Color.BLACK);
	
	public TestTitle() {
		
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(300, 150));
		titelNorth.setPreferredSize(new Dimension(300, 60));
		titelCenter.setPreferredSize(new Dimension(300, 180));
		titelSouth.setPreferredSize(new Dimension(300, 30));
		add(titelNorth, BorderLayout.NORTH);
		add(titelCenter, BorderLayout.CENTER);
		add(titelSouth, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
	JFrame frame = new JFrame(); 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	frame.add(new TestTitle());
	frame.pack();
	frame.setVisible(true);
	}
}
