package p5;

/**
 * Klassen testar olika tärningsklasser genom att kasta tärningen X antal gånger 
 * och sedan skriva ut resultaten av kasten. 
 * 
 * @author David Tran
 * Datum 2014-12-06
 *
 */
public class TestDice {
	
	Dice dice;

	/**
	 * Kastar en angiven tärningen antal gånger som är angivet. 
	 * @param dice tärning som ska kastas
	 * @param nbrOfThrows antal kast 
	 */
	public static void test ( Dice dice, int nbrOfThrows ) {
		
		int antalPrickar;
		//skapa en array för att räkna antalet 1:or, 2:or ocv som tärningen visar vid kasten nedan
		int[] res = new int[ dice.getSides() ];
		
		for( int i = 0; i < nbrOfThrows; i++ ) {
			
			//spelaren kastar sin tärning 
			antalPrickar = dice.throwDice();
			//öka räknare för antalet prickar i kastet.
			res[ antalPrickar - 1 ]++;
		}
		TestSimpleDice.printResult( res );
		TextWindow.println();
	}

	/**
	 * Kastar en angiven tärning antal gånger som är angivet. 
	 * Kontrollerar om tärningen är tillhörande en OrdinayPlayer eller en Cheater. 
	 * 
	 * @param player spelaren 
	 * @param nbrOfThrows antal kast
	 */
	public static void test( Player player, int nbrOfThrows ) {
		
		Dice dice = null;
		int antalPrickar;
		
		//om spelaren är av klassen OrdinaryPlayer så har han en "vanlig" tärning
		if (player instanceof OrdinaryPlayer) {
			//typkonvertera för att kunna använda metoden getDice()
			OrdinaryPlayer spelare = (OrdinaryPlayer) player;
			dice = spelare.getDice();
			
		//om spelaren är av klassen OrdinaryPlayer så har han en fusk-tärning
		} else if (player instanceof Cheater) {
			//typkonvertera för att kunna använda metoden getDice()
			Cheater spelare = (Cheater) player;
			dice = spelare.getDice();
		}
		
		//skapa en array för att räkna antalet 1:or, 2:or ocv som tärningen visar vid kasten nedan
		int[] res = new int[ dice.getSides() ];
				
		for( int i = 0; i < nbrOfThrows; i++ ) {
			//spelaren kastar sin tärning 
			antalPrickar = player.throwDice();
			//öka räknare för antalet prickar i kastet.
			res[ antalPrickar - 1 ]++;
		}
		TestSimpleDice.printResult( res );
		TextWindow.println();
	}
}
