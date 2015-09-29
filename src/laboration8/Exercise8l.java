package laboration8;

import javax.swing.JOptionPane;

public class Exercise8l {
	
	public void numbers () {
		
		int nbr1, nbr2, sum=0;
		String talen;
		
		nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Ange undre intervallgränsen: "));
		nbr2 = Integer.parseInt(JOptionPane.showInputDialog("Ange övre intervallgränsen: "));
		
		System.out.println("Intervall: ["+ nbr1 + "," + nbr2 + "]\nTal i intervallet: ");
		
		String message;
		
		for ( int i = nbr1; nbr1 <= nbr2; i++ ) {
			message = ( i + " ");
			sum += i;
			
			
		}
		JOptionPane.showMessageDialog(null, message);
			
		
		
		
		
	}

}
