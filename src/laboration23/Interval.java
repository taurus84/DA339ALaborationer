package laboration23;

public class Interval implements WageFilter {

	private int min;
	private int max;
	
	public Interval( int min, int max ) {
		this.min = min;
		this.max = max;
	}
	public boolean accept(WageEmployee employed) {
		if ( employed.wage() >= min && employed.wage() <= max ) {
			return true;
		} else		
			return false;
	}
	
	

}
