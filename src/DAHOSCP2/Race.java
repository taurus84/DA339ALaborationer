package DAHOSCP2;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class Race {
	// instansvariablerna från class PaintWindow och Car.
	private PaintWindow window;
	private Car car1;
	private Car car2;
	
	
	
	//Konstructor som tar emot argumenten 
	public Race(PaintWindow window1, Car bil1, Car bil2){
		this.car1 = bil1;
		this.car2 = bil2;
		this.window = window1;
		
	}
	
	public void action(){
		
		Random rand = new Random(); // Random objekt
		
		window.fillRect(0, 0, 600, 400, Color.BLACK); // bakgrundsfärg
		window.line(50, 100, 550, 100, Color.GREEN, 40);// linje med grön färg
		window.line(50, 300, 550, 300, Color.GREEN, 40);// linje med grån färg
		window.line(75, 50, 75, 150, Color.CYAN, 20); // linje med turkos färg
		window.line(75, 250, 75, 350, Color.CYAN, 20); // linje med turkos färg
		
		car1.moveTo(500, 85); // ger bil 1 x och y värden,
		car2.moveTo(500, 285);// ger bil 2 x och y värden
		window.showImage(car1.getImage(), car1.getX(), car1.getY());// visar bil 1 i rutan
		window.showImage(car2.getImage(), car2.getX(), car2.getY());// visar bil 2 i rutan
		
		while (car1.getX()>63 && car2.getX()>63){ // En while loop som pågår tills x värdena fö bil 1 och 2 är mindre än 64
			
			window.showImage(car1.getImage(), car1.getX(), car1.getY()); // visar bil 1 i rutan
			window.showImage(car2.getImage(), car2.getX(), car2.getY()); // visar bil 2 i rutan
			PaintWindow.pause(10); // pausar i rutan
			int car1dx = rand.nextInt(7);// ger variablen ett random värde
			int car2dx = rand.nextInt(7);// ger variablen ett random värde
			car1.moveTo(car1.getX() - car1dx, 85); // ändrar x värdet i bil 1
			car2.moveTo(car2.getX() - car2dx, 285);// ändrar x värdet i bil 2
			
			
			if (car1.getX() < 64){ // en if-sats för bil 1
				
				Text txt = new Text("The winner is blue car!!!", new Font ("SanSerif", Font.BOLD, 25), Color.BLUE); // ett Text objekt
				window.showImage(txt, 100, 50); // visar text objektet
				
			}else if (car2.getX() < 64){ // else if sats för bil 2
				Text txt = new Text ("The winner is red car!!!", new Font("SanSerif", Font.BOLD, 25), Color.RED);// ett Text objekt
				window.showImage(txt, 100, 350); // visar text objektet
			}
			
			}
		
	}
	
	
}
