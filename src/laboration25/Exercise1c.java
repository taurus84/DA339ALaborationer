package laboration25;

import resurser.InOut;

public class Exercise1c {
	public static void main(String[] args) {
		InOut io = new InOut();
		int nbr = io.readInt("Mata in ett tal utan decimaler");
		System.out.println("Inmatat tal: " + nbr);
	}
}