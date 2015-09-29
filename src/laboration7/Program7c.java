package laboration7;

import javax.swing.JOptionPane;

public class Program7c {
	
	public void youngOld () {
		
		int age;
		
		age = Integer.parseInt(JOptionPane.showInputDialog("Hur gammal är du?"));
		
		if (age < 18)
			System.out.println("Du är ett barn");
		else {
			System.out.println("Du är vuxen");
				
		}
	
		
	}

	public static void main(String[] args){
		Program7c person = new Program7c ();
		person.youngOld();
	}
}
