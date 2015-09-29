package laboration12;

public class House {
	private int year;
	private double size;
	private double garden;
	
	public House ( int inYear, double inSize, double inGarden ) {
		this.year = inYear;
		this.size = inSize;
		this.garden = inGarden;
	}
	public void setYear(int year ) {
		this.year = year;
	}
	public void setSize( double size ) {
		this.size = size;
	}
	public void setGarden (double garden){
		this.garden = garden;
	}
	public int getYear(){
		return this.year;
	}
	public double getSize(){
		return this.size;
	}
	public double getGarden(){
		return this.garden;
	}
	public String toString(){
		String res = "Hus byggt " + this.year + " med " + this.size + " kvm bostadsyta. Tomten är " + this.garden + " kvm stor";
		return res;
	}

}
