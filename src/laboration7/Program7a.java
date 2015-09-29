package laboration7;

import javax.swing.JOptionPane;

public class Program7a {
	
	public void bigger () {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett heltal"));
		
		if (num > 100)
			System.out.println("Talet är större än 100");
		
		
		
	}
	
	public static void main (String[] args) {
		Program7a todo = new Program7a();
		todo.bigger();
	}

}
