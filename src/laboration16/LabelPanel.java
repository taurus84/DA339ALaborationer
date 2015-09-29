package laboration16;

import java.awt.*;

import javax.swing.*;

public class LabelPanel extends JPanel{
	
	private JLabel bg = new JLabel();
	
	public LabelPanel () {
		
		setPreferredSize( new Dimension(500,400));
		this.setLayout(new BorderLayout());		
		bg.setOpaque(true);
		add(bg);
		
	}
	public void setColor (Color color) {
		bg.setBackground(color);
	
	}
		
		


}

