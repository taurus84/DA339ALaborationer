package laboration12;

import javax.swing.JOptionPane;

public class HouseTest {
	
	public void action(){
		int inYear;
		double inSize, inGarden;
		
		inYear = Integer.parseInt(JOptionPane.showInputDialog("Vilket år byggdes huset?"));
		inSize = Double.parseDouble(JOptionPane.showInputDialog("Hur stort är huset? (kvm)"));
		inGarden = Double.parseDouble(JOptionPane.showInputDialog("Hur stor är tomten? (kvm)"));
		
		House hus = new House(inYear, inSize, inGarden);
		JOptionPane.showMessageDialog(null, hus.toString());
		
		hus.setYear(1945);
		hus.setSize(1005);
		hus.setGarden(5500);
		
		
		
		
		System.out.println(hus.getYear());
		System.out.println(hus.getSize());
		System.out.println(hus.getGarden());
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args){
		HouseTest prog = new HouseTest();
		prog.action();
		
		
		
		
		
	}

}
