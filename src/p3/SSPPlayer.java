package p3;

import java.util.Random;

public class SSPPlayer {
	
	private Random rand = new Random();
	
	public int getComChoice() {
		int nbr = rand.nextInt(3);
		return nbr;
	}
	

}
