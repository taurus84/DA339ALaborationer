package p5;

import java.util.Random;

/**
 * Klassen SimpleDice representerar en tärning med minst en sida. 
 * 
 * @author David Tran
 * Datum 2014-12-04
 */
public class SimpleDice implements Dice {
	
	private int sides;

	/**
	 * Konstruerar och initialiserar en tärning med sides=6
	 */
	public SimpleDice() {
		this.sides = 6;					//6-sidig tärning om inget annat givits
	}

	/**
	 * Konstruerar och initialiserar en tärning med angivna värden
	 * @param inSides antal sidor på tärning
	 * @throws NegativeSidesException ifall inmatningen av antal sidor på tärning är mindre än 1 
	 */
	public SimpleDice(int inSides) throws NegativeSidesException{

		if ( inSides <= 0 ) {
			throw new NegativeSidesException ("Tärningen måste ha minst 1 sida: " + inSides);
		} else 
	    this.sides = inSides;
	}

	/**
	 * Returnerar ett slumpat tal som representerar antalet prickar på tärningskastet
	 * @return kastade tärningens prickar 
	 */
	public int throwDice()  {
		Random rand = new Random();
		return ( rand.nextInt(this.sides) + 1 );		//rand slumpar tal börjat från 0, därför +1
		
	}	
	
	/**
	 * Returnerar antalet sidor på tärningen
	 * @return antal sidor på tärning
	 */
	public int getSides() {
		return this.sides;
	}
}