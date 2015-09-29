package laboration3;

import javax.swing.JOptionPane;

public class Time {
	
	public void seconds() {
		
		int hour, min, sec, totSec;
		String message;
		
		hour=Integer.parseInt(JOptionPane.showInputDialog("Antal timmar:"));
		min=Integer.parseInt(JOptionPane.showInputDialog("Antal minuter:"));
		sec=Integer.parseInt(JOptionPane.showInputDialog("Antal sekunder:"));
		
		totSec = hour*60*60 + min*60 + sec;
		
		message = hour+" hour, "+min+" minutes, and "+sec+" seconds is equivalent to "+totSec+" seconds.";
		
		JOptionPane.showMessageDialog(null, message);
			
				
		
		
	}
	public static void main(String[] args) {
		Time calc = new Time();
		calc.seconds();
		
	}

}
