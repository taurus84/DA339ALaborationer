package laboration3;

import javax.swing.JOptionPane;

public class TempConverter {
	
	double fahr, celc;
	
	
	public void fahrenheit() {
		
		String message;
		
		
		fahr=Double.parseDouble(JOptionPane.showInputDialog("Ange grader i Fahrenheit"));
		
		celc=(fahr-32) / 1.8;
		
		message=fahr+" grader Fahrenheit är "+celc+" grader Celsius";
						
		JOptionPane.showMessageDialog(null, message);
		

		
		
	}
	public static void main(String [] args) {
		TempConverter c1 = new TempConverter();
		c1.fahrenheit();
		
	}

}
