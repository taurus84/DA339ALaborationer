package laboration3;

import javax.swing.JOptionPane;

public class Person {

	public void beskriv(){
		int height, age;
		String name;
		
		height=Integer.parseInt(JOptionPane.showInputDialog("Ange din höjd (cm)"));
		age=Integer.parseInt(JOptionPane.showInputDialog("Ange din ålder"));
		name=JOptionPane.showInputDialog("Ditt namn");
		
		JOptionPane.showMessageDialog(null,name+" "+"är "+height+"cm lång och "+age+"år gammal");
		
	}
	public static void main(String[] args){
		Person pers = new Person();
		pers.beskriv();
	}
}
