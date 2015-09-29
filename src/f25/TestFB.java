package f25;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestFB extends JPanel {
	Color[] array = {Color.RED, Color.BLUE, Color.PINK,Color.GREEN, Color.WHITE};
	private FlashingButton btnColor = new FlashingButton("Välj färg",array,1000);
	private FlashingButton btnExit = new FlashingButton("Avsluta");
	private JLabel lblColor = new JLabel();
	private ActionListener al = new ChangeColor();

	public TestFB() {
		setLayout(new GridLayout(3,1));
		setPreferredSize(new Dimension(200,150));
		lblColor.setOpaque(true);
		add(lblColor);
		add(btnColor);
		add(btnExit);
		btnColor.addActionListener(new ChangeColor());
		btnExit.addActionListener(new Exit());
	}

	private class ChangeColor implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblColor.setBackground(btnColor.getBackground());
		}
	}
	
	private class Exit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
    	SwingUtilities.invokeLater( new Runnable() {
    		public void run() {
    			JFrame frame = new JFrame("Flashing buttons");
    			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			frame.add(new TestFB());
    			frame.pack();
    			frame.setVisible(true);
    		}
    	});
    }
}