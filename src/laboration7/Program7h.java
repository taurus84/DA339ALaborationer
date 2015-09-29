package laboration7;

import javax.swing.JOptionPane;

public class Program7h {
	public void biggest () {
		int nbr1, nbr2, nbr3, biggest;
		
		nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett heltal"));
		nbr2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett andra heltal"));
		nbr3 = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett tredje heltal"));

		if ((nbr1 >= nbr2) && (nbr1 >= nbr3)) {
			biggest = nbr1;
		}
		else if ((nbr2 >= nbr1) && (nbr2 >= nbr3)) {
			biggest = nbr2;
		}
		else {
			biggest = nbr3;
		}
		
		JOptionPane.showMessageDialog(null, "Det största av de tre inmatade talen är " + biggest);
		
	}
	
	public static void main(String[] args) {
		Program7h p7f = new Program7h ();
		p7f.biggest();
	}
}

