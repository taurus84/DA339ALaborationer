package laboration7;

import javax.swing.JOptionPane;

public class Program7f {
	public void biggest () {
		int nbr1, nbr2, biggest = 0;
		
		nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett heltal"));
		nbr2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett till heltal"));
		
		if (nbr1 >= nbr2)
			biggest = nbr1;
		else {
			biggest = nbr2;
		}
		
		JOptionPane.showMessageDialog(null, "Det största av de två inmatade värdena är " + biggest);
		
	}
	
	public static void main(String[] args) {
		Program7f p7f = new Program7f ();
		p7f.biggest();
	}
}
