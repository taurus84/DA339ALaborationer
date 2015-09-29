package f16;
import javax.swing.*;
import java.awt.*;

public class NullLayoutPanel extends JPanel {
	private JPanel panel = new JPanel();
	private JButton button1 = new JButton("button1");
	private JButton button2 = new JButton("button2");
    
    public NullLayoutPanel() {
    	setPreferredSize( new Dimension(280,200) );
        setLayout(null);        // Varje komponent måste placeras speciellt
		panel.setLayout(null);  // Varje komponent måste placeras speciellt
		panel.setBackground( new Color(11,204,146) );
		panel.setBorder( BorderFactory.createLineBorder( Color.BLACK ) );
		button1.setBounds(70, 20, 90, 20);
		button2.setBounds(20, 60, 90, 20);
		panel.setBounds(70, 60, 200, 95);
		panel.add(button2);
		add(button1);
		add(panel);
    }
}
