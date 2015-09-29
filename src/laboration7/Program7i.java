package laboration7;

import javax.swing.*;

public class Program7i {
	public void leapYear () {
		int year;
				
		year = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett årtal efter 1581"));
		
		if (year < 1582) {
			JOptionPane.showMessageDialog(null, "Året är före den gregorianska kalendern!");
		}
			else {
				if ( (year%4) == 0) {
					if (( (year%100) == 0 ) && ((year%400) == 0)) {
					JOptionPane.showMessageDialog(null, year + " är ett skottår");
					}
					else {
					JOptionPane.showMessageDialog(null, year + " är inget skottår");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, year + " är inget skottår");
					
				}
			}
	
		
		
		
		
	}
	public static void main (String[] args) {
		Program7i p7i = new Program7i ();
		p7i.leapYear ();
	}

}
