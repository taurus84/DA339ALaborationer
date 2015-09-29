package laboration7;

import javax.swing.JOptionPane;

public class Program7b {
	
	public void calc () {
		
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett heltal"));
		
		if (num > 100)
			System.out.println("Talet är större än 100");
		else {
			System.out.println("Talet är max 100");
			
		}
			
			
		
		
		
	}

	public static void main(String[] args){
		Program7b todo = new Program7b();
		todo.calc();
		
		
		
	}
}
