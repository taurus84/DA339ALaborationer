package p5;
import javax.swing.*;

public class TestOrdinaryPlayer {
    public static void roll( Player player, int antalKast ) {
        // Typkonvertera referensen till "Referens till OrdinaryPlayer"
        OrdinaryPlayer op = ( OrdinaryPlayer )player;
        // Använda OrdinaryPlayer-referensen för att erhålla spelarens Dice-objekt
        // Här går det inte att använda Player-referensen (player) eftersom metoden 
        // getDice() inte är deklarerad i klassen Player (eller i Object).
        Dice dice = op.getDice();
        int sides = dice.getSides(), aThrow;
        // Skapa en array för att räkna antalet 1:or, 2:or ocv som tärningen visar vid kasten nedan 
        int[] result = new int[ sides ];
        TextWindow.println( "----- " + antalKast + " kast av " + player.getName() + 
                " med " + sides + "-sidig tärning -----" );
        for( int i = 0; i < antalKast; i++ ) {
            // Låta spelaren kasta sin tärning
            aThrow = player.throwDice();
            // Öka räknare för antalet prickar i kastet.
            result[ aThrow - 1 ]++;
        }
        // Utskrift av antalet 1:r, 2:or osv
        TestSimpleDice.printResult( result );
    }
    
    public static void main( String[] args ) {
        Player player1 = new OrdinaryPlayer( "Stefan" , new SimpleDice( 8 ) );
        Player player2 = new OrdinaryPlayer( "Signe" );
        TestOrdinaryPlayer.roll( player1, 1000000 );
        TestOrdinaryPlayer.roll( player2, 50 );
        ( (OrdinaryPlayer)player1 ).setDice( new SimpleDice( 3 ) );
        TestOrdinaryPlayer.roll( player1, 10 );
    	
    	
//		  SimpleDice tärning = new SimpleDice( 6 );
//        Player spelare1 = new OrdinaryPlayer( "Gustav", tärning ); 
//        Player spelare2 = new OrdinaryPlayer( "Valborg", tärning ); 
//        Game spel = new Game( spelare1, spelare2 );
//        spel.play( true );
 
//    	TestDice.test( new SimpleDice( 6 ), 1000000 );
//        TextWindow.println();
//        TestDice.test( new SimpleDice( 4 ), 1000000 );
    
//    	Player spelare1 = new OrdinaryPlayer( "Viktor",new SimpleDice( 6 ) ); Player spelare2 = new Cheater( "Signe", new SimpleDice( 6 ) );
//    	Game spel = new Game( spelare1, spelare2 );
//    	TextWindow.println( "\nResultatet av tio spel" );
//    	    for( int i=0; i<10; i++ )
//    	        spel.play( false );

//    	TestDice.test( new OrdinaryPlayer( "Rut", new SimpleDice( 6 ) ), 1000000 ); 
//    	TextWindow.println();
//    	TestDice.test( new Cheater( "Fuffe", new SimpleDice( 6 ) ), 1000000 );
//    	    
    }
}
