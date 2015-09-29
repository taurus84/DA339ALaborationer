package laboration15;

import javax.swing.JFrame;

public class StartAll {
	
	
	public void start() {
		JFrame frame = new JFrame("Alla program");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new AllPanels());
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		StartAll app = new StartAll();
		app.start();
	}

	
	

}
