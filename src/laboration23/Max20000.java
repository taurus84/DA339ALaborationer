package laboration23;

public class Max20000 implements WageFilter {

	
	public boolean accept(WageEmployee employed) {
		if ( employed.wage() <= 20000 ) {
			return true;
		} else 
			return false;
		
		
	}

	
}
