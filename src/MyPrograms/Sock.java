package MyPrograms;


/**
 * Ett program sorterar strumpor. 
 * Frågar användaren hur många stumpor det är och hur många olika sorter det finns, 
 * och vilka sorter det är. 
 * Programmet skriver sedan ut hur många det finns av varje och hur många par det finns.
 * @author David
 *
 */

public class Sock {
	
	private String color;
	private boolean sorted;
	
	public Sock(String inColor) {
		this.color = inColor;
		this.sorted = false;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSorted(int nbr) {
		if (nbr != 0 ) {
			this.sorted = true;
		}
	}
	
	public boolean isSorted() {
		return sorted;
	}

}














/*
Metoder:
		Skapa en array med antal sockplatser
		Ge varje position en referens till en String som anger namnet


*/