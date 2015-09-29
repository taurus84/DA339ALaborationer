package laboration23;

public class Between17000And21000 implements WageFilter {

	
	public boolean accept(WageEmployee employed) {
		
		if ( employed.wage() >= 17000 && employed.wage() <= 21000 ) {
			return true;
		} else
		return false;
	}
	

}
