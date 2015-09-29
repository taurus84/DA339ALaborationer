package laboration3;

import javax.swing.JOptionPane;

public class Program3i {

	public void old() {
	int age, year, year100;
	String name, message;
	
	name=JOptionPane.showInputDialog("Ange ditt namn");
	age=Integer.parseInt(JOptionPane.showInputDialog("Ange din ålder"));
	year=Integer.parseInt(JOptionPane.showInputDialog("Ange nuvarande år"));
	
	year100 = year + (100-age);
	message = name+", år "+year100+" fyller du 100 år";
	
	
	JOptionPane.showMessageDialog(null, message);
	
	}
	public static void main(String[] args) {
		Program3i pers = new Program3i();
		pers.old();
		
	}
}
