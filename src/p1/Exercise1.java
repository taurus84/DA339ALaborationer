package p1;
import java.util.Random;

import javax.swing. *;

public class Exercise1 {
	
    /*
     * Metoden beräknar totala biljettpriset och det genomsnittliga
     * biljettpriset för ett antal vuxna, barn och pensionärer.
     **/	
	public void exercise1a() {
		
		//Deklaration av variabler som ska användas 
		int barn, vuxna, pensionärer, totalpris, genomsnitt;
		
		//Användaren skriver in antalet barn, vuxna och pensionärer. Dessa lagras i sedan i "barn", "vuxna" och "pensionärer"
		barn = Integer.parseInt(JOptionPane.showInputDialog ("Ange antalet barn"));
		vuxna = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet vuxna"));
		pensionärer = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet pensionärer"));
		
		//Totalpriset räknas ut för de antal personer som användaren matat in. Siffrorna är priset per person
	    totalpris = barn * 60 + vuxna * 110 + pensionärer * 80;
	    //Genomsnittspriset räknas ut. 
	    genomsnitt = totalpris/(barn+vuxna+pensionärer);
	   
	    //Ett meddelande fönster som visar totalpriset och genomsnittspriset 
	    JOptionPane.showMessageDialog(null, "Totala priset är: " + totalpris + "\n" + "Genomsnittspriset är: " + genomsnitt);
		
	}
	/*
	 * Metoden skriver ut udda tal i intervallet 1-100
	 */
	public void exercise1b() {
		
		//Initiering, villkor för upprepning och uppdatering bestäms för loopen
		for (int i=1 ; i<=100 ; i=i+2){
			//De udda talen skrivs ut
			System.out.print(i + " ");
		}
		
	}
	/*Metoden ber användaren att mata in tal 
	 * för att sedan tala om det är noll, negativt eller positivt
	 */
	public void exercise1c() {

		//Deklarerar variabler 
		int nbr;
		//Input fönster för användaren att mata i tal
		nbr = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett tal"));
		
		//Loop 
		for(int i = nbr ; i <= nbr ; i++){
		//Om talet är 0 visas meddelandet "Talet "nbr" är noll"	
		if(i == 0){
			System.out.println("Talet " + nbr + " är noll");
		//Om talet är  mindre än noll visas "Talet "nbr" är negativt"	
		}if(nbr < 0){
			System.out.println("Talet " + nbr + " är negativt");
		//Om talet är större än noll visas "Talet "nbr" är positivt"	
		}if(nbr > 0){
			System.out.println("Talet " + nbr + " är positivt");
			}
		}
		
	}
	
	/* 
	 * Metoden skriver ut vart sjunde tal i ett intervall som användaren bestämmer. 
	 * */
	public void exercise1d() {
		//Deklarerar variabler
		int min, max;
		min = Integer.parseInt(JOptionPane.showInputDialog("Ange minsta värdet"));
		max = Integer.parseInt(JOptionPane.showInputDialog("Ange största vädet"));
		
		//i står för vart sjunde tal från min
		for (int i=min ; i<=max ; i+=7 ){
			//Talen skrivs ut
			System.out.print(i + " ");
		}
		
	}
	
	public void exercise1e() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("/Applications/Eclipse/Skola/DA339ALaborationer/src/p1/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = -3;   
		int dy = 0;   
		int x = 250;  //Bildens position
		int y = rand.nextInt(height-100);  // Bildens höjd är 100
		
		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while(true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx;
			y += dy;
			//Bilden rör sig inom intervallet och flyger inte ur fönstret
			if(x<0 || x>500){
				dx = -dx;
		
			}
		}		
	}	
	
	
	public void exercise1f() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("/Applications/Eclipse/Skola/DA339ALaborationer/src/p1/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = 0;   
		int dy = -2;   
		int x = 50;  //Bildens position 
		int y = rand.nextInt(height-100);  // Bildens höjd är 100
		
		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret stängs
		while(true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx;
			y += dy;
			//Bilden rör sig inom intervallet och flyger inte ur fönstret
			if(y<0 || y>300){
				dy = -dy;
			}
			
		}

	}
}