package laboration20;

public class Exercise20c {
	
	
	public int lessThanOneMillion(Population[] array) {
		
		long inhabitants;
		int tot = 0;
		for ( Population pop : array ) {
			inhabitants = pop.getPopulation();
			if ( inhabitants < 1000000) {
				tot++;
			}
		}
		return tot;
	}

	public int startsWithK(Population[] array) {
		

		char firstChar;
		String country;
		int totK = 0;
		
		for ( Population pop : array ) {
			country = pop.getCountry();
			firstChar = country.charAt(0);
			
			if ( firstChar == 'M' ) {
				totK++;
			}
		}
		return totK;
	}

	public Population[] getTenToTwelveMillions(Population[] array) {
		
		int tot10to12 = 0;
		long inhabitants;
		int index = 0;		
	
		for ( Population pop : array ) {
			inhabitants = pop.getPopulation();
			
			if ( inhabitants >= 10000000 && inhabitants <= 12000000 ) {
				tot10to12++;
			}
		}
		Population[] newArray = new Population[ tot10to12 ];
		
		for ( int i = 0; i < array.length; i++) {
			inhabitants = array[i].getPopulation();
			
			if ( inhabitants >= 10000000 && inhabitants <= 12000000) {
				newArray[index] = array[i];
				index++;
				
			}
			
		}
		return newArray;
		
	}

	public Population[] getStartsWithK(Population[] array) {
		

		int index = 0, totK = 0;
		String country;
		char firstChar;
		
		for ( Population pop : array ) {
			if ( pop.getCountry().charAt(0) == 'K') {
				totK++;
			}
		}
	
		Population[] newArray = new Population[totK];
		
		for ( int i = 0; i < array.length; i++) {
			country = array[i].getCountry();
			firstChar = country.charAt(0);
			
			if ( firstChar == 'K' ) {
				newArray[index] = array[i];
				index++;
			}
			
		}
		return newArray;
	}

	public void program() {
		Population[] countries = Populations.readPopulations("src/laboration20/befolkning.txt");
		Population[] res;
		// Aktivera testerna en i taget, men först när du kompletterat metoderna med kod.
	
		// test lessThanOneMillion
 		int n = lessThanOneMillion( countries );
		System.out.println( n + " länder har mindre än 1 miljon invånare");
		
		// startsWithK
		n = startsWithK( countries );
		System.out.println( n + " länder börjar på bokstaven 'K'");
		
		
		
		// test getTenToTwelveMillions
		res = getTenToTwelveMillions( countries );
		for( int i = 0; i < res.length; i++ ) {
			System.out.println( res[ i ].toString() );
		}
			
		//test getStartsWithK
		res = getStartsWithK( countries );
		for( int i = 0; i < res.length; i++ ) {
			System.out.println( res[ i ].toString() );
		 }
		
		
		
	}
	
	

	
	public static void main(String[] args) {
		Exercise20c e20c = new Exercise20c();
		e20c.program();
	}
}
