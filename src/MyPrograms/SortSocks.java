package MyPrograms;

import java.awt.Color;

import javax.swing.JOptionPane;

/**
 * Klassen sorterar sockar.
 * @author David
 *
 */

public class SortSocks {
	
	private String[] color;
	private int nbrOfSocks;
	Sock[] socks = new Sock[10];
	
	
	public SortSocks(int nbrOfSocks, int howManyColors) {
		this.nbrOfSocks = nbrOfSocks;
		color = new String[howManyColors];
	//	socks = new Sock[nbrOfSocks];
	}
	
	public void setNbrOfSocks(int total) {
		this.nbrOfSocks = total;
	}
	
	public void nameColor() {
		
		for(int i = 0; i < socks.length;) {
			String farg = JOptionPane.showInputDialog("Ange färg: ");
			int antal = Integer.parseInt(JOptionPane.showInputDialog("Hur många strumpor är där av färgen " + farg));
			for(int j = 0; j < antal; j++) {
				this.socks[i+j].setColor(farg);
				i++;
			}
			
		
		}
	}
	
}
