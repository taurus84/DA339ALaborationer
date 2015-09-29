package laboration10;

import javax.swing.JOptionPane;

public class Car {
	private String brand;
	private String color;
	private int year;
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void info(){
		String message = "Märke: " + this.brand + "\n" + "Färg; " + this.color + "\n" + "Årsmodell: " + this.year;
		JOptionPane.showMessageDialog(null, message);
		
	}
}
