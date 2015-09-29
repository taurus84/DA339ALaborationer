package DAHOSCP2;

/**
 * Klassen visar vilken titel, vem som målat den och vilket år.
 * 
 * @author Oscar
 *
 */

public class Painting {
	
	private String title; // Instansvariabler 
	private String painter;
	private int year;
	
	// Konnstructor med string, string, int
	public Painting(String title, String painter, int year){
		this.title = title;
		this.painter = painter;
		this.year = year;
	}
	
	//Get metod som retunerar title
	public String getTitle(){
		return title;
		
	}
	//Get metod som retunerar painter
	public String getPainter(){
		return painter;
		
	}
	//Get metod som returnerar year
	public int getYear(){
		return year;
	}
	//Get metod som retunerar en sträng
	public String toString(){
		return title + " av " + painter + ", " + year;
	}
}
