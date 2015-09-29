package laboration3;

import javax.swing.JOptionPane;

public class Seconds {
	
	public void calc() {
		
		int hours, min, sec, secStart;
		String message;
		
		sec=Integer.parseInt(JOptionPane.showInputDialog("Ange antal sekunder:"));
		
		hours = sec / 3600;
		sec = sec - hours*3600;
		min = sec / 60;
		sec= sec - min*60;
		secStart = sec + min*60 + hours*3600; 
				
		message = secStart+" seconds is equivalent to "+hours+" hours, "+min+" minutes, and "+sec+" seconds.";
		
		JOptionPane.showMessageDialog(null, message);
		
				
		
	}
	public static void main(String [] args) {
		
		Seconds sekunder = new Seconds();
		sekunder.calc();
	}

}
