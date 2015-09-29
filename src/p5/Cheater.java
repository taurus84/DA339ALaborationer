package p5;
import java.util.Random;

/**
 * Klassen Cheater representerar en spelare med en tärning. 
 * Cheater-spelaren kan lägga till en extra prick på tärningen för att få högre värde. 
 * Cheater är en subklass till klassen Player. 
 * 
 * @author David
 * Datum 2014-12-04	
 */
public class Cheater extends Player {
	
	private Dice dice;
	private Random rand = new Random(); 
	
	/**
	 * Konstruerar och initialiserar en spelare med angivet namn och en tärning med 6 sidor
	 * @param name spelarens namn
	 */
	public Cheater(String name) {
		super(name);	
		this.dice = new SimpleDice(6);
	}
	
	/**
	 * Konstruerar och initialiserar spelare med angivna värden
	 * @param name spelaren namn
	 * @param dice spelarens tärning
	 */
	public Cheater(String name, Dice dice) {
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
	 * Kastar tärningen. Spelaren anger en prick för mycket vid cirka hälften av kasten.
	 * Om tärningen visar max antal prickar låter spelaren bli att fuska.
	 * @return thrown det kastade värdet 
	 * @return cheatedDice kastade värdet +1
	 */
	public int throwDice() {
		int thrown = dice.throwDice();
		int cheatedDice = thrown + 1;
		
		if ( thrown == dice.getSides() ) {			//maxvärde på kastet?
			return thrown;
		}
		else {
			if ( rand.nextInt( 2 ) == 1 ) {			//fuska ca varannan gång
				return cheatedDice;
			} else
				return thrown;
		}

	}

}
