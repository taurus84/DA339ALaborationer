package f16;
import javax.swing.*;

public class Calculator {
	
	private void newFrame(JPanel panel, String title) {
		JFrame frame = new JFrame( title );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add( panel );
		frame.pack();
		frame.setVisible( true );
	}
	
	private void start() {
        Viewer viewer = new Viewer();
        Controller cont = new Controller(viewer);
        UserInput user = new UserInput(cont);
        newFrame( viewer, "Viewer" );
        newFrame( user, "UserInput" );
	}

    public static void main(String[] args) {
    	Calculator calc = new Calculator();
    	calc.start();
    }   
}
