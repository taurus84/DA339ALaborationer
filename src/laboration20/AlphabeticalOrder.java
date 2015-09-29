package laboration20;

import java.text.*;
import java.util.Comparator;
import java.lang.*;

public class AlphabeticalOrder implements Comparator{

	public int compare( Object obj1, Object obj2 ) {
	    Population country1 = ( Population )obj1;
	    Population country2 = ( Population )obj2;
	    String name1 = country1.getCountry();
	    String name2 = country2.getCountry();
	    
	    Collator coll = Collator.getInstance();
	    
	    return   coll.compare(name1, name2);
	    
	
	    
	    
	}

	


}
