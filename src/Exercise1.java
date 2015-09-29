package p1;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercise1 {
	
    /*
     * Metoden beräknar totala biljettpriset och det genomsnittliga
     * biljettpriset för ett antal vuxna, barn och pensionärer.
     **/	
	public void exercise1a() {
	
		//deklaration av variablerna som används i metoden. Priserna för de olika grupperna är på förhand bestämda.
		int adults, children, oldies, total, average, 
		adultP = 110, childP = 60, oldieP = 80; 
		
		//användaren matar in antal vuxna. Lagras i 'adults'
		adults = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet vuxna: ")); 
		
		//användaren matar in antal barn. Lagras i 'children'
		children = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet barn: "));
		
		//användaren matar in antal pensionärer. Lagras i 'oldies' 
		oldies = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet pensionärer: ")); 
		
		//räknar ut totalpriset för sällskapet. Lagras i 'total'
		total = adults*adultP + children*childP + oldies*oldieP; 						 
		
		//totalpriset delas på antal passagerare för att få fram genomsnittet. I detta fall avrundas priset ner till närmaste krona. Lagras i 'average'
		average = total / (adults + children + oldies);								
		
		//skapar en sträng 'message' med utskriften som ska visa totala och genomsnittliga priset. 																						
		String message = "Totala priset är: " + total + " kr\n"										
					+ "Genomsnittpriset är: " + average + "kr"; 
		
		//en dialogruta som visar utskriften från strängen message
		JOptionPane.showMessageDialog(null, message);												
	
	
	}
	
	/*
	 * Metoden skriver ut samtliga udda tal från 1-100
	 */
	public void exercise1b() {
		
		//skapar en loop. Initierar variabeln 'i' till '0' och låter loopen fortsätta 100 gånger 
		for (int i=0; i<=100; i++) {				
			
			//undersöker om talet är delbart med 2. Om nej, talet är udda och talet kommer att skrivas ut. Om delbart med 2 börjar loopen om och 'i' ökas med 1.									
			if ( i % 2 != 0) {						
				System.out.print( i + " ");			//det udda talet skrivs ut. 'i' ökar sedan med 1 och villkoret kontrolleras. 
													//efter varje avslutad loop ökar 'i' med 1 och villkoret kontrolleras igen. 
			}
				
		}
	}
	
	/*
	 * Metoden ska låta användaren mata in 4 heltal. Efter varje inskrivet tal skriver metoden ut om talet är 0, negativt eller positivt.
	 */
	 public void exercise1c() {
		//deklaration av variabler som används i programmet
		 int nbr;																			
		
		 //metoden skapar en for-loop som låter blocket köra 4 gånger. 
		 for ( int i=1; i<=4; i++) {													
			 nbr = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett tal"));	//metoden låter användaren mata in ett tal
			 
			 if ( nbr == 0) {															
				 System.out.println("Talet " + nbr + " är noll");						//om inmatade talet är 0 så skrivs denna text ut
			 } else if ( nbr < 0 ) {
				 System.out.println("Talet " + nbr + " är negativt");					//om inmatade talet är mindre än 0 skrivs denna kod ut
			 } else {
				 System.out.println("Talet " + nbr + " är positivt");					//om det ovanstående inte uppfyller villkoren så är det denna text som skriv ut. 
					 
			 }
			 
		 }
		 
	 }	 
	 /*
	  * Metoden ska fråga efter två heltal som användaren ska mata in. 
	  * Metoden ska sedan i en meddelanderuta skriva ut en serie med tal som börjar på det minsta värdet 
	  * och sedan vart sjunde tal i intervallet. Tal över max ska inte skrivas ut.  
	  */
	 public void exercise1d() {
		 
		//deklarerar vilka variabler som används i metoden. 
		int min, max;
	
		//skapar en variabel 'str' till en sträng som kommer innehålla texten som ska skrivas ut i meddelanderutan.
		String str = "";																	
		
		//användaren matar in ett minsta värde
		min = Integer.parseInt(JOptionPane.showInputDialog("Ange minsta värdet"));
		
		//användaren matar in ett största värde
		max = Integer.parseInt(JOptionPane.showInputDialog("Ange största värdet"));		
		
		//skapar en for-loop som kollar om 'min' är mindre än 'max'. Om 'min'<'max' så läggs 'min' in i strängen 'str'. 'min' ökar sedan med 7 för att sedan undersökas igen. 		
		 for (int i = min; i <= max; i = i + 7) {										
			if ( (max - i) < 7) {							//om differensen är mindre än 7 är detta sista talet som ska läggas in i strängen 'str' 
				str += i;									//därför inget kommatecken efter 'i' i strängen 'str'.
			} else {
			 
			 str +=  i + ", ";								//Om differensen är större än eller lika med 7 så kommer det att läggas till mer text i strängen 'str', så därför läggs ett kommatecken till efter.
		 
			}
		 }
		//metoden skriver ut strängen 'str' 
		System.out.println(str);															
	 
	 
	 
	 
	 }
	
	 /*
	  * Metoden ska låta en bild "studsa" mellan vänster och höger sida i en fönster.
	  */
	public void exercise1e() {
		//skapar ett paintWindow-objekt
		PaintWindow pw = new PaintWindow();					
		
		//Skapa ett objekt 'rand' som kan slumpa fram tal
		Random rand = new Random();
		
		//skapar ett objekt 'image' som håller reda på bilden metoden ska använda
		ImageIcon image = new ImageIcon("/Applications/Eclipse/Skola/DA339ALaborationer/src/p1/gubbe.jpg"); 
		
		//kollar värdet för bredden på fönstret. Lagras i 'width'
		int width = pw.getBackgroundWidth();
		
		//kollar värdet för höjden på fönstret. Lagras i 'height'
		int height = pw.getBackgroundHeight();
		
		//deklareration variabel 'dx' och ges värde '-3'. Anger hur mycket x kommer att ändra sig efter varje exekvering. 
		int dx = -3;
		
		//deklaration variabel 'dy' och ges värde '0'. Anger hr mycket y kommer att ändra sig efter varje exekvering.
		int dy = 0;
		
		//deklareration av variabel 'x' som anger startposistion i x-led för bildens övre vänsterhörn. Ges värdet '250'
		int x = 250;
		
		//deklaration av variabel 'y'. Får en slumpad starthöjd för bildens överkant, räknat uppifrån. 
		int y = rand.nextInt(height-100);  // Bildens höjd är 100
		
		// oändlig loop, raderna 128-136 upprepas tills PaintWindow-fönstret stängs
		while(true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx;				//'x' ökar med 'dx' efter en loop
			y += dy;				//'y' ökar med 'dy' efter en loop
			if(x<0) {				//om 'x' blir mindre än noll, bilden på väg ut i vänster kant, så ändras tecken på 'dx', 
				dx = -dx;			//vilket medför att 'x' ökas efter varje exekvering. Bilden kommer röra sig mot höger.
			}
			if(x>(width-100)) {		//om 'x' blir strörre än bredden på fönstret minus ett taget värde '100' för bildens bredd, så är bilden
				dx = -dx;			//på väg ut i höger kant. då ska 'dx' byta tecken igen, för att 'x' ska minska efter varje loop. 
			}						//bilden kommer att röra sig åt vänster.
		}
	}
	
	/*
	 * Metoden ska låta en bild "studsa" mellan alla fyra väggar i ett fönster.
	 */
	 public void exercise1f() {
			//Skapa ett paintWindow-objekt
		 	PaintWindow pw = new PaintWindow();
			
		 	//Skapa ett objekt som kan slumpa fram tal
		 	Random rand = new Random();
			
		 	//Skapa ett objekt image som håller reda på bilden vi ska använda i metoden.
		 	ImageIcon image = new ImageIcon("/Applications/Eclipse/Skola/DA339ALaborationer/src/p1/gubbe.jpg"); //alternativt "C:/bilder/gubbe.jpg"
			
		 	//deklaration av varibalen 'width'. Kollar bredden på fönstret. Lagras i 'width'
		 	int width = pw.getBackgroundWidth();
		 	
		 	//deklaration av varibeln 'height'. Kollar höjden på fönstret. Lagras i 'height'
			int height = pw.getBackgroundHeight();
			
			//deklaration av variabeln 'dx'. Slumpa fram ett värde mellan -3 - 3. Lagras i 'dx' 
			int dx = rand.nextInt(7)-3;
			
			//deklaration av variabeln 'dy'. Slumpa fram ett värde mellan -3 - 3. Lagras i 'dy'
			int dy = rand.nextInt(7)-3;
			
			//Deklaration av variabeln 'x'. Slumpa ett tal 0-500 som anger startpunkt. Lagras i 'x'
			int x = rand.nextInt(501);
			
			//Deklaration av variabeln 'y'. Slumpa ett tal 0 till höjden på fönstret minus 100(bildens höjd). Lagras i 'y' 
			int y = rand.nextInt(height-100);  // Bildens höjd är 100
			
			// oändlig loop, raderna 163-177 upprepas tills PaintWindow-fönstret stängs
			while(true) {
				pw.showImage(image, x, y);
				PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
				x += dx;				//öka 'x' med 'dx' efter en loop
				y += dy;				//öka 'y' med 'dy' efter en loop
				if(x<0) {				//om 'x' blir mindre än noll, bilden på väg ut i vänster kant, så ändras tecken på 'dx', 
					dx = -dx;			//vilket medför att 'x' ökas efter varje loop. Bilden kommer röra sig mot höger.
				}
				if(x>(width-100)) {		//om 'x' blir strörre än bredden på fönstret minus ett taget värde 100 för bildens bredd, bilden
					dx = -dx;			//på väg ut i höger kant. 'dx' bytar då tecken igen, för att 'x' ska minska efter varje loop. 
				}						//bilden kommer att röra sig åt vänster.
				if (y<0) {				//om 'y' blir mindre än noll är bilden på väg ut i övre kant av fönster. 
					dy = -dy;			//byter tecken på 'dy' vilket medför att 'y' blir större för varje exekvering. Bilden rör sig nedåt.
				}
				if (y>(height-100)) {	//om 'y' blir större än fönstrets höjd minus 100 som är bildens höjd. Botten på bilden på väg ut i nedre kant.
					dy = -dy;			//byter tecken på 'dy' så att 'y' blir mindre för varje exekvering. Bilden rör sig uppåt.
				}
			} 
		 
		 
		 
		 
	 }
	
}
