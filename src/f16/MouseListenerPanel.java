package f16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MouseListenerPanel extends JPanel {
	private JPanel panel = new JPanel();
	private JButton button1 = new JButton("button1");
	private JButton button2 = new JButton("button2");
    
    public MouseListenerPanel() {
    	setPreferredSize( new Dimension(280,200) );
        setLayout(null);        // Varje komponent måste placeras speciellt
		panel.setLayout(null);  // Varje komponent måste placeras speciellt
		panel.setBackground( new Color(11,204,146) );
		panel.setBorder( BorderFactory.createLineBorder( Color.BLACK ) );
		button1.setBounds(70, 20, 90, 20);
		button2.setBounds(20, 60, 90, 20);
		panel.setBounds(70, 60, 200, 95);
		panel.addMouseListener( new ML() );
		panel.add(button2);
		add(button1);
		add(panel);
    }
    
    private class ML implements MouseListener {
    	Random rand = new Random();
		public void mouseEntered(MouseEvent arg0) {
			button1.setBackground( new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
		}

		public void mouseExited(MouseEvent arg0) {
			button2.setBackground( new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
		}

		public void mousePressed(MouseEvent arg0) {
			setBackground( new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
		}

		public void mouseReleased(MouseEvent arg0) {
			panel.setBackground( new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
		}
    	
		public void mouseClicked(MouseEvent arg0) {
		}
    }
    
    public static void main(String[] args) {
		JOptionPane.showMessageDialog( null, new MouseListenerPanel() );
	}
}
