package laboration10;

import javax.swing.JOptionPane;

public class CarTest {
	public void action(){
		Car bil = new Car();
		
		bil.setBrand(JOptionPane.showInputDialog("Märke på bilen:"));
		bil.setColor(JOptionPane.showInputDialog("Färg på bilen:"));
		bil.setYear(Integer.parseInt(JOptionPane.showInputDialog("Årsmodell:")));
		bil.info();
		
	}
	
	public static void main(String[] args) {
		CarTest run = new CarTest();
		run.action();
	}
}
