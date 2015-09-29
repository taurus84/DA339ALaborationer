package MyPrograms;

import javax.swing.JOptionPane;

public class SockTest {
	
	public static void main (String [] args) {
		
		int antal = Integer.parseInt(JOptionPane.showInputDialog("Hur många sockar ska sorteras?"));
		int color = Integer.parseInt(JOptionPane.showInputDialog("Hur många olika färger finns det?"));
		SortSocks sortera = new SortSocks(antal, color);
		
		sortera.nameColor();
		
		
	}

}
