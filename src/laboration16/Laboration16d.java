package laboration16;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Laboration16d {
	private void showFrame(String title, int x, int y, JPanel panel) {
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setLocation(x, y);
		frame.setVisible(true);
	}

	public void action() {
		LabelPanel labelPanel = new LabelPanel();
		Controller2 controller2 = new Controller2 (labelPanel);
		ColorPanel colorPanel = new ColorPanel(controller2);
		showFrame("ColorChooser", 50, 50, colorPanel);
		showFrame("Color viewer", 500, 50, labelPanel);
	}
	
	public static void main(String[] args) {
		Laboration16d lab16d = new Laboration16d();
//		lab16d.action(); 
	}
}
