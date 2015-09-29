package p5;

/**
 * Klassen OrdinaryPlayer representerar en spelare med en tärning. 
 * OrdinaryPlayer är en subklass till klassen Player. 
 * 
 * @author David
 * Datum 2014-12-04
 *
 */
public class OrdinaryPlayer extends Player {

	private Dice dice;
	
	/**
	 * Konstruerar och initialiserar en spelare med angivet namn och en tärning med 6 sidor
	 *  
	 * @param name spelarens namn
	 */
	public OrdinaryPlayer(String name) {
		super(name);	
		this.dice = new SimpleDice(6);
	}
	
	/**
	 * Konstruerar och initialiserar spelare med angivna värden
	 * @param name spelarens namn
	 * @param dice spelarens tärning
	 */
	public OrdinaryPlayer(String name, Dice dice) {
		super(name);
		this.dice = dice;		
	}
	
	/**
	 * Ger spelaren en ny tärning
	 * @param dice en ny tärning
 	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	/**
	 * Returnerar spelarens tärning
	 * @return dice spelarens tärning
	 */
	public Dice getDice() {
		return this.dice;
	}

	/**
	 * Kastar tärningen
	 * @return returnerar det kastade värdet
	 */
	public int throwDice() {
		return dice.throwDice();

	}
	
	

}
