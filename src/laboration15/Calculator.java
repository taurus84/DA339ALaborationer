package laboration15;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class Calculator {
	

	public void start() {
		JFrame frame = new JFrame("Kalkylator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new CalcPanel());
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Calculator app = new Calculator();
		app.start();
	}
}