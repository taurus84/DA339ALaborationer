package p5;

/**
 * Klassen skapar en tärning där man på förhand bestämt hur många sidor tärningen har,
 * samt angett hur stor sannolikhet i procent varje sida har att visas.
 * I klassen kan man kasta tärningen och få reda på hur många sidor tärningen har. 
 * 
 * @author David Tran
 * Datum 2014-12-06
 */
import java.util.Random;

public class ProbabilityDice implements Dice {
	
	private int[] probs;
	private Random rand = new Random();
	
	/**
	 * Konstruerar och initialiserar en tärning med angivna värden 
	 * @param array sannolikheten i procent att respektiva sida vinner
	 */
	public ProbabilityDice (int[] array) {
		this.probs = array;
	}

	/**
	 * returnerar antal sidor på tärningen
	 * @return probs.length antal sidor på tärningen
	 */
	public int getSides() {
		return probs.length;
	}
	
	/**
	 * slumpar ett tärningskast med sannolikheten given hur stor chans varje sida har att visas. 
	 * @return diceNbr kastade tärningens antal prickar
	 */
	public int throwDice()  {
		int nbr = rand.nextInt(100);		//slumpa ett värde mellan 0-99. Summan av sannolikheterna är 100
		int sum = 0;
		int diceNbr = 0;
		
		//traverserar arrayen och summerar för varje index. 
		//När summan överstiger det slumpade, lagras indexet och det returneras efter adderat 1. Index börjar på 0. 
		for (int i = 0; i < probs.length; i++ ) {
			sum += probs[i];
			if (sum > nbr) {
				diceNbr = i + 1;
				break;
			}
		}
		return diceNbr;
	}
}