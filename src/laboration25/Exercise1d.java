package laboration25;

import resurser.InOut;

public class Exercise1d {
	public static void main(String[] args) {
		InOut io = new InOut();
		//double nbr = io.readDouble("Mata in ett decimaltal mindre än 10.0");
		double nbr = io.readDouble(); 
		System.out.println("Inmatat tal: " + nbr);
	}
}