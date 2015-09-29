package laboration8;

import java.util.Random;

public class Exercise8k {
	
	public void kasta (){
		Random rand = new Random ();
		int kast, antal=0;
		
		kast = rand.nextInt(6)+1;
		
		while (kast != 1) {
			antal = antal +1;
			System.out.println("Du kastade en:" + kast);
			kast = rand.nextInt(6)+1;
		
		}
		System.out.println("Antal kast innan du kastede en 1a: " + antal);
			
		
	}
	public static void main(String[] args) {
		Exercise8k dice = new Exercise8k ();
		dice.kasta();
	}
}
