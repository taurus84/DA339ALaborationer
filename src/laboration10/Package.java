package laboration10;

import javax.swing.JOptionPane;

public class Package {
	public int length;
	public int width;
	public int depth;
	public double weight;
	
	public void setLength(int length){
		this.length = length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public void setDepth(int depth){
		this.depth = depth;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public void info(){
		String message = ("PAKET: " + length + " x " + width + " x "
				+ depth + ", vikt = " + weight + " kg");
		JOptionPane.showMessageDialog(null, message);
	}
}
