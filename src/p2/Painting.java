package p2;

public class Painting {

	private String title;
	private String painter;
	private int year;
	
	public Painting(String inTitle, String inPainter, int inYear){
		
		this.title = inTitle;
		this.painter = inPainter;
		this.year = inYear;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getpainter() {
		return this.painter;
	}
	public int getYear() {
		return this.year;
	}
	public String toString () {
		String res = this.title + " av " + this.painter + ", " + this.year;
		return res;
	}
}
