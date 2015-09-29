package resurser;

import javax.swing.JOptionPane;

public class InOut {

	public static int readInt() {
		int value = 0;
		boolean inputOK = false;
		do {
			try {
				value = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett heltal")); 
				inputOK = true;
			} 
		    catch( NumberFormatException ex ) {}
		} while( inputOK == false );
		return value;
	}

	public static int readInt( String txt ) {
		int value = 0;
		boolean inputOK = false;
		do {
			try {
				value = Integer.parseInt(JOptionPane.showInputDialog(txt)); 
				inputOK = true;
			} 
		    catch( NumberFormatException ex ) {}
		} while( inputOK == false );
		return value;
	}
	
	public static double readDouble( String txt ) {
		double value = 0;
		double max = 10.0;
		boolean inputOK = false;
		do {
			try {
				value = Double.parseDouble(JOptionPane.showInputDialog(txt)); 
				if (value < max)
				inputOK = true;
			} 
		    catch( NumberFormatException ex ) {}
			catch( NullPointerException ex2) {}
		} while( inputOK == false );
		return value;
	}

	 public static double readDouble() {
		 return readDouble("Mata in ett decimaltal");
	 }
}


