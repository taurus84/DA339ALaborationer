package laboration7;

import javax.swing.JOptionPane;

public class Program7d {
	
	public void count () {
		
		int nbrOfChars;
		String name;
		
		name = JOptionPane.showInputDialog("Vad heter du?");
		nbrOfChars = name.length();
		
		if (nbrOfChars < 5 && nbrOfChars > 0)
			System.out.println(name + ", ditt namn är kort och fint!");
		else if (nbrOfChars == 0)
			System.out.println("Du måste ju skriva något när jag ber dig!");
		else {
			System.out.println(name + ", ditt namn är långt och svårstavat!");
		}
		
		
	}
	
	public static void main(String[] args) {
		Program7d person = new Program7d();
		person.count();
	}

}
