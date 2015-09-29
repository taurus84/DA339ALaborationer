package laboration20;

public class Exercise20b {
	
	
	public void printCountries(Population[] array) {
		
		for ( int i = 0; i < array.length; i++) {
			System.out.println(array[i].getCountry());
		}
	}

	public void moreThanHundredMillions(Population[] array) {
		
		int tot = 0;
		for ( Population pop : array) {
			if ( pop.getPopulation() > 100000000) {
				tot++;
			}
		}
		System.out.print( tot + " länder har mer än 100 miljoner invånare");
	}

	public void startsWithM(Population[] array) {
		
		String country;
		char firstChar;
		int tot = 0;
		
		for ( Population pop : array) {
			country = pop.getCountry();
			firstChar = country.charAt(0);
			
			if ( firstChar == 'M') {
				tot++;
			}
			
		}
		System.out.print( tot + " länder börjar med bokstaven 'M'");
	}

	public void eightToTenMillions(Population[] array) {
		
		int tot = 0;
		long inhabitants;
		for ( Population pop : array ) {
			inhabitants = pop.getPopulation();
			
			if ( inhabitants >= 8000000 && inhabitants <= 10000000 ) {
				tot++;
			}
		}
		System.out.print( tot + " länder har mellan 8-10 miljoner invånare");
	}

	public void program() {
		Population[] countries = Populations.readPopulations("src/laboration20/befolkning.txt");
		
		
		
		
//		Aktivera metoderna en i taget, men först när du kompletterat kod.
//		printCountries(countries);
//		moreThanHundredMillions(countries);
//		startsWithM(countries);
		eightToTenMillions(countries);
	}

	public static void main(String[] args) {
		Exercise20b e20b = new Exercise20b();
		e20b.program();
	}
}